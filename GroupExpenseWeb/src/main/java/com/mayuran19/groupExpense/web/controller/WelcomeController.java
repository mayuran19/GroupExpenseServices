package com.mayuran19.groupExpense.web.controller;

import com.mayuran19.groupExpense.model.json.Expense;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by mayuran on 1/3/16.
 */
@RestController
public class WelcomeController {
    @RequestMapping(value = "/welcome/greet", method = RequestMethod.GET)
    public String greet() {
        return "Hello World";
    }

    @RequestMapping(value = "/welcome/getExpense", method = RequestMethod.GET)
    public @ResponseBody Expense getExpense(){
        Expense expense = new Expense();
        expense.setDiscription("Test expense");
        expense.setAmount(100);
        expense.setApplicableUsersIds(Arrays.asList(new Long[]{1l,2l}));
        expense.setUserId(3l);

        return expense;
    }
}
