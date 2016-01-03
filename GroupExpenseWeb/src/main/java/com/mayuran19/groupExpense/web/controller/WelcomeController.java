package com.mayuran19.groupExpense.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayuran on 1/3/16.
 */
@RestController
public class WelcomeController {
    @RequestMapping(value = "/welcome/greet", method = RequestMethod.GET)
    public String greet(){
        return "Hello World";
    }
}
