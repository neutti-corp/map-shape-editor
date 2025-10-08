package com.neutti.config;
import com.neutti.config.anno.BaseMapper;
import com.neutti.util.RefreshableSqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@MapperScan(value = {
        "com.neutti.config",
        "com.neutti.webpage",
}, annotationClass = BaseMapper.class)
public class DatabaseConfig {
    @Resource
    DataSource dataSource;

    @Resource
    private ApplicationContext applicationContext;

    @Bean
    @Primary
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        RefreshableSqlSessionFactoryBean factoryBean = new RefreshableSqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis/config/mybatis-config.xml"));
        factoryBean.setMapperLocations(applicationContext.getResources("classpath:mybatis/mapper/**/*.xml"));
        factoryBean.setInterval(1000);
        return factoryBean;
    }
}
