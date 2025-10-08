package com.neutti.config.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MapAuthenticationProvider implements AuthenticationProvider {

    @Resource
    private UserDetailsService service;

    @Resource
    private MapPasswordEncoder encoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;
        String username = token.getName();
        String password = (String) token.getCredentials();
        LoginUserDetails user = (LoginUserDetails) service.loadUserByUsername(username);
        if(!encoder.matches(password, user.getPassword())){
            throw new BadCredentialsException(username);
        }
        if(!user.isEnabled()) {
            throw new BadCredentialsException(username);
        }
        return new MapUsernamePasswordAuthenticationToken(user);
    }
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
