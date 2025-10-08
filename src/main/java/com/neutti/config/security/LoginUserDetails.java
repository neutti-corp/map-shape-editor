package com.neutti.config.security;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
public class LoginUserDetails implements UserDetails {

    private String userId;
    private String username; //user_id
    private String password;
    private boolean enabled = true;
    private String userFnm;
    private Boolean passwordInitlAt = false;
    private String insttCode;
    private String loginedSystemId;
    private String loginedRemoteIp;
    private String operatingSystem;
    private String browerVersion;
    private Date loginedTime;
    private String esetleId;
    private String orgnztCode;
    private String esetleDeptNm;
    private String rspofcNm;
    private Integer deptIseLvl;
    private Integer rspofcIseLvl;
    private String telno;
    private String cryalTelno;
    private String emailadres;
    private Boolean innerUserAt = true;
    private Boolean mssageRecptnAt;
    private Date lastCancerhochangeDt;
    private Date useEndDte;
    private Boolean asignChargerAt;
    private String administesntRegistNm;
    private Boolean docReadngAuthorAt;
    private Boolean docEditAuthorAt;
    private Boolean gnrlPrntngAuthorAt;
    private Boolean scrtyPrntngAThorAt;
    private Boolean encptRelisauthorAt;
    private Boolean encptStreauthorAt;
    private Boolean scrtydocRelisAuthorAt;
    private Boolean scrtydocAuthorAt;
    private String tmprPassword;
    private Date tmprConfmDte;
    private Integer loginFailrCo = 0;
    private Boolean acntLockAt;
    private String lifyeamd;
    private String accespermIp;
    private Boolean accespermIpApplcAt = false;
    private Boolean dplctLoginPermAt = false;
    private List<MapGrantedAuthority> authority;
    boolean authenticated = true;
    boolean anonymous = false;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authority;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setAuthority(List<MapGrantedAuthority> authority) {
        this.authority = authority;
    }


    public List getRoles() {
        List roles = new ArrayList();
        for(MapGrantedAuthority role1 : authority){
            roles.add(role1.getAuthority());
        }
        return roles;
    }

    public MapUsernamePasswordAuthenticationToken newToken(){
        return new MapUsernamePasswordAuthenticationToken(this);
    }


    public boolean hasAnyRole(String... roles) {
        for(MapGrantedAuthority role1 : authority){
            for(String role2 : roles){
                if(role1.getAuthority().equals(role2)){
                    return true;
                }
            }
        }
        return false;
    }
}
