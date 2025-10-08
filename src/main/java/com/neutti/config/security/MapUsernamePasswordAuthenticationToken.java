package com.neutti.config.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class MapUsernamePasswordAuthenticationToken extends UsernamePasswordAuthenticationToken {
    LoginUserDetails user;
    public MapUsernamePasswordAuthenticationToken(LoginUserDetails user) {
        super(user.getUsername(), user.getPassword(), user.getAuthorities());
        this.user = user;
    }

    @Override
    public Object getPrincipal() {
        return this.user;
    }
}
