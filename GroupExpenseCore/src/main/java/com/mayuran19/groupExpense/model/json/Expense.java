package com.mayuran19.groupExpense.model.json;

import java.util.Date;
import java.util.List;

/**
 * Created by mayuran on 1/5/16.
 */
public class Expense {
    private Long id;
    private Long userId;
    private String discription;
    private double amount;
    private Date date;
    private List<Long> applicableUsersIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Long> getApplicableUsersIds() {
        return applicableUsersIds;
    }

    public void setApplicableUsersIds(List<Long> applicableUsersIds) {
        this.applicableUsersIds = applicableUsersIds;
    }
}
