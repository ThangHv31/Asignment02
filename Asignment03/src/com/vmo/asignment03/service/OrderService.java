package com.vmo.asignment03.service;

import com.vmo.asignment03.entities.Order;
import com.vmo.asignment03.utils.Validation;

import static com.vmo.asignment03.utils.Validation.sc;

public class OrderService {
    public static Order input() {
        boolean status;
        Order order = new Order();
        System.out.println("+ Enter Order number: ");
        order.setNumber(sc.nextLine());
        do {
            System.out.println("+ Enter Order date(mm-dd-yyyy): ");
            order.setDate(sc.nextLine());
            if (Validation.validateDate(order.getDate())) {
                status = false;
            } else {
                status = true;
            }
        } while (status);

        return order;
    }
}
