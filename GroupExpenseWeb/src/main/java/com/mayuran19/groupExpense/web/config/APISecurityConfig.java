package com.mayuran19.groupExpense.web.config;

import com.mayuran19.groupExpense.web.security.APIUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by satch on 1/28/2016.
 * This class is used to configure all the API related security configurations.
 * The urls starts with /api/
 */
@Configuration
@ComponentScan(basePackages = {"com.mayuran19.groupExpense.web.security"})
@EnableWebSecurity
@Order(1)
public class APISecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private APIUserDetailsService apiUserDetailsService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(apiUserDetailsService);
        //auth.inMemoryAuthentication().withUser("api").password("password").roles("API_USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //allow anonymous POSTs to login
                .antMatchers(HttpMethod.POST, "/api/login").permitAll()

                //all other request need to be authenticated
                .antMatchers("/api/**").access("hasRole('API_USER')")
                .and().formLogin().and().exceptionHandling().accessDeniedPage("/accessDenied");
        ;
    }
}
