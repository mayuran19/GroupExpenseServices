package com.mayuran19.groupExpense.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by mayuran on 1/4/16.
 * This class is used to configure the setting for the
 * services dispatcher servlet. Things such as setting the Request & Response
 * mapping converters
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.mayuran19.groupExpense.web.controller"})
public class WebServicesConfig extends WebMvcConfigurerAdapter{

}
