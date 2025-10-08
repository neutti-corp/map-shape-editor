package com.neutti.config.security;

import lombok.Data;

@Data
public class AnonymousDetails extends LoginUserDetails {
    boolean authenticated = false;
    boolean anonymous = true;
}
