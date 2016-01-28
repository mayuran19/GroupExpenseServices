package com.mayuran19.groupExpense.web.config;

import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.filter.DelegatingFilterProxy;

/**
 * Created by mayuran on 1/10/16.
 * This will create a filter with name "springSecurityFilterChain" that is of the type "FilterChainProxy"
 * and add it as the first filter to the application filter chain
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

}
