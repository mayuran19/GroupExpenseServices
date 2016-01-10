package com.mayuran19.groupExpense.web.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by mayuran on 1/4/16.
 * This class is used to import the spring configurations.
 * Web related configurations such as Request & Response mappers are
 * imported using @Import annotation from java class
 * Other spring configurations belongs to root context can be imported
 * using @ImportResource
 */
@Configuration
@Import({})
@ImportResource({})
@ComponentScan(basePackages = {"com.mayuran19.groupExpense.web.controller"})
@EnableWebMvc
public class ServicesServletConfig extends WebMvcConfigurerAdapter {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(converter());
    }

    @Bean
    public MappingJackson2HttpMessageConverter converter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        //converter.setObjectMapper(mapper());
        return converter;
    }
}
