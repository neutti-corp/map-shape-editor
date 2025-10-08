package com.neutti.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class RefreshableSqlSessionFactoryBean extends SqlSessionFactoryBean implements DisposableBean {
    private static final Log LOG = LogFactory.getLog(RefreshableSqlSessionFactoryBean.class);
    private SqlSessionFactory proxy;
    private int interval = 500;
    private Timer timer;
    private TimerTask task;
    private Resource[] mapperLocations;
    private boolean running = false;
    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r;
    private final Lock w;

    public RefreshableSqlSessionFactoryBean() {
        this.r = this.rwl.readLock();
        this.w = this.rwl.writeLock();
    }

    public void setMapperLocations(Resource[] mapperLocations) {
        super.setMapperLocations(mapperLocations);
        this.mapperLocations = mapperLocations;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void refresh() throws Exception {
        if (LOG.isInfoEnabled()) {
            LOG.info("refreshing sqlMapClient.");
        }

        this.w.lock();

        try {
            super.afterPropertiesSet();
        } finally {
            this.w.unlock();
        }

    }

    public void afterPropertiesSet() throws Exception {
        super.afterPropertiesSet();
        this.setRefreshable();
    }

    private void setRefreshable() {
        this.proxy = (SqlSessionFactory) Proxy.newProxyInstance(SqlSessionFactory.class.getClassLoader(), new Class[]{SqlSessionFactory.class}, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(RefreshableSqlSessionFactoryBean.this.getParentObject(), args);
            }
        });
        this.task = new TimerTask() {
            private Map<Resource, Long> map = new HashMap();

            public void run() {
                if (this.isModified()) {
                    try {
                        RefreshableSqlSessionFactoryBean.this.refresh();
                    } catch (NullPointerException var2) {
                        RefreshableSqlSessionFactoryBean.LOG.error("null pointer exception", var2);
                    } catch (Exception var3) {
                        RefreshableSqlSessionFactoryBean.LOG.error("caught exception", var3);
                    }
                }

            }

            private boolean isModified() {
                boolean retVal = false;
                if (RefreshableSqlSessionFactoryBean.this.mapperLocations != null) {
                    for(int i = 0; i < RefreshableSqlSessionFactoryBean.this.mapperLocations.length; ++i) {
                        Resource mappingLocation = RefreshableSqlSessionFactoryBean.this.mapperLocations[i];
                        retVal |= this.findModifiedResource(mappingLocation);
                    }
                }

                return retVal;
            }

            private boolean findModifiedResource(Resource resource) {
                boolean retVal = false;
                ArrayList modifiedResources = new ArrayList();

                try {
                    long modified = resource.lastModified();
                    if (this.map.containsKey(resource)) {
                        long lastModified = (Long)this.map.get(resource);
                        if (lastModified != modified) {
                            this.map.put(resource, new Long(modified));
                            modifiedResources.add(resource.getDescription());
                            retVal = true;
                        }
                    } else {
                        this.map.put(resource, new Long(modified));
                    }
                } catch (IOException var8) {
                    RefreshableSqlSessionFactoryBean.LOG.error("caught exception", var8);
                }

                if (retVal && RefreshableSqlSessionFactoryBean.LOG.isInfoEnabled()) {
                    RefreshableSqlSessionFactoryBean.LOG.info("modified files : " + modifiedResources);
                }

                return retVal;
            }
        };
        this.timer = new Timer(true);
        this.resetInterval();
    }

    private Object getParentObject() throws Exception {
        this.r.lock();

        SqlSessionFactory var1;
        try {
            var1 = super.getObject();
        } finally {
            this.r.unlock();
        }

        return var1;
    }

    public SqlSessionFactory getObject() {
        return this.proxy;
    }

    public Class<? extends SqlSessionFactory> getObjectType() {
        Class<? extends SqlSessionFactory> objectType = null;
        if (this.proxy != null) {
            objectType = this.proxy.getClass();
        } else {
            objectType = SqlSessionFactory.class;
        }

        return objectType;
    }

    public boolean isSingleton() {
        return true;
    }

    public void setCheckInterval(int ms) {
        this.interval = ms;
        if (this.timer != null) {
            this.resetInterval();
        }

    }

    private void resetInterval() {
        if (this.running) {
            this.timer.cancel();
            this.running = false;
        }

        if (this.interval > 0) {
            this.timer.schedule(this.task, 0L, (long)this.interval);
            this.running = true;
        }

    }

    public void destroy() throws Exception {
        this.timer.cancel();
    }
}

