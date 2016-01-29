package com.mayuran19.groupExpense.web.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satch on 1/29/2016.
 */
@Service("apiUserDetailsService")
public class APIUserDetailsService implements UserDetailsService {
    private static final String USERNAME = "APIUSER";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username != null && USERNAME.equals(username)) {
            List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
            GrantedAuthority grantedAuthority = new APIGrantedAuthority();
            grantedAuthorities.add(grantedAuthority);
            APIUser apiUser = new APIUser(username, "password", true, true, true, true, grantedAuthorities);
            return apiUser;
        } else {
            throw new UsernameNotFoundException("User not found");
        }

    }
}
