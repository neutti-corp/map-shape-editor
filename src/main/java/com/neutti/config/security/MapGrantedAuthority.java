package com.neutti.config.security;

import org.springframework.security.core.GrantedAuthority;

public class MapGrantedAuthority implements GrantedAuthority {
    private String name;
    private String authority;

    public MapGrantedAuthority() {
    }
    public MapGrantedAuthority(String name, String authority) {
        this.name = name;
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
