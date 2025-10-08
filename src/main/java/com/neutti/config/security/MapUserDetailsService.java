package com.neutti.config.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MapUserDetailsService implements UserDetailsService {

    @Resource
    private UserMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginUserDetails user = mapper.getUserById(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }
        return user;
    }
}
