package com.mayuran19.groupExpense.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by mayuran on 1/4/16.
 * This class is used to import the spring configurations.
 * Web related configurations such as Request & Response mappers are
 * imported using @Import annotation from java class
 * Other spring configurations belongs to root context can be imported
 * using @ImportResource
 */
@Configuration
@Import(WebServicesConfig.class)
@ImportResource({})
public class WebServicesServletConfig {
}
