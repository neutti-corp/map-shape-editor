package com.neutti.config.security;



import com.neutti.config.anno.BaseMapper;

import java.util.List;

@BaseMapper
public interface UserMapper {
    LoginUserDetails getUserById(String username);
    List<MapGrantedAuthority> getRoleById(String username);
}
