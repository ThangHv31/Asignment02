package com.vmo.asignment03.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    private String name;
    private String phoneNumber;
    private String address;
    private List<Order> orderList = new ArrayList<Order>();


    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", orderList=" + orderList +
                '}';
    }

    public Customer(String name, String phoneNumber, String address, List<Order> orderList) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
