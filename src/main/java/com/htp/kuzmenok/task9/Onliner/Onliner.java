package com.htp.kuzmenok.task9.Onliner;

import java.util.Comparator;

public class Onliner implements Comparator <Onliner> {
    private String category;
    private Integer amount;

    public Onliner() {
    }

    public Onliner(String category) {
        this.category = category;
    }

    public Onliner(String category, Integer amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public int compare(Onliner o1, Onliner o2) {
        return o2.getAmount().compareTo(o1.getAmount());
    }
}
