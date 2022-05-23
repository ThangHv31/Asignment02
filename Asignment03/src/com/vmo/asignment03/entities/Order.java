package com.vmo.asignment03.entities;

import static com.vmo.asignment03.utils.Validation.sc;

public class Order {
    private String number;
    private String date;

    @Override
    public String toString() {
        return "Order [ \n" +
                "\nnumber= " + number +
                "\ndate= " + date +
                "]";
    }

    public Order(String number, String date) {
        this.number = number;
        this.date = date;
    }

    public Order() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
