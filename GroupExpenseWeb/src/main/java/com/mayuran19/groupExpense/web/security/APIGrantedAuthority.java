package com.mayuran19.groupExpense.web.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by satch on 1/30/2016.
 */
public class APIGrantedAuthority implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return "API_USER";
    }
}
