package com.mayuran19.groupExpense.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by mayuran on 1/4/16.
 * This class is used to configure whole application related settings. This class is registered
 * in RootAppInitializer
 */
@Configuration
@Import({WebSecurityConfig.class, APISecurityConfig.class})
public class RootAppConfig {

}
