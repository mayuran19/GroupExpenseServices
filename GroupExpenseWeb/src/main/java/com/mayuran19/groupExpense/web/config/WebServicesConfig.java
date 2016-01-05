package com.mayuran19.groupExpense.web.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

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
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
    }

    @Bean
    public MappingJackson2HttpMessageConverter converter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(mapper());
        return converter;
    }

    @Bean
    public ObjectMapper mapper() {
        return new ObjectMapper();
    }
}
