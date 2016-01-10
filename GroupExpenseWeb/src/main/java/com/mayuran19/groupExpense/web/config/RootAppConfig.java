package com.mayuran19.groupExpense.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by mayuran on 1/4/16.
 */
@Configuration
@Import({SecurityConfig.class})
public class RootAppConfig {

}
