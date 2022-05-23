package com.vmo.asignment03.service;

import com.vmo.asignment03.entities.Customer;
import com.vmo.asignment03.entities.Order;
import com.vmo.asignment03.utils.Validation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.vmo.asignment03.Application.list;
import static com.vmo.asignment03.service.OrderService.input;
import static com.vmo.asignment03.utils.Validation.sc;

public class CustomerService {

    // Ham them moi khach hang vao danh sach
    public static List<Customer> createCustomer() {
        boolean check;
        do {
            Customer customer = new Customer();
            System.out.println("Enter Customer's information: ");
            System.out.println("Enter name: ");
            customer.setName(sc.nextLine());

            do {
                System.out.println("Enter phone number: ");
                customer.setPhoneNumber(sc.nextLine());
                if (Validation.validatePhoneNumber(customer.getPhoneNumber())) {
                    check = false;
                } else {
                    check = true;
                }
            } while (check);

            System.out.println("Enter address: ");
            customer.setAddress(sc.nextLine());

            System.out.println("Enter number of Order: ");
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                customer.getOrderList().add(input());
            }
            System.out.println("Do you want to continue? if no, please type 'n' or 'N'");
            String selection = sc.nextLine();

            if (selection.equals("n") || selection.equals("N")) {
                check = false;
            } else {
                check = true;
            }
            list.add(customer);
        } while (check);
        return list;
    }

    //Ham hien thi danh sach tat ca khach hang
    public static List<Customer> findAll() {
        return list;
    }

    public static void save(List<Customer> customers) {
        try {
            File file = new File("customer.dat");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < customers.size(); i++) {
                bufferedWriter.write("Customer [" + (i + 1) + "]: ");
                bufferedWriter.write("\nCustomer Name: " + customers.get(i).getName());
                bufferedWriter.write("\nPhone Number: " + customers.get(i).getPhoneNumber());
                bufferedWriter.write("\nAddress: " + customers.get(i).getAddress());
                bufferedWriter.write("\nOrder List: ");
                for (int j = 0; j < customers.get(i).getOrderList().size(); j++) {
                    bufferedWriter.write("Order [" + (j + 1) + "]: ");
                    bufferedWriter.write("Date: " + customers.get(i).getOrderList().get(j).getDate() + " - ");
                    bufferedWriter.write("Number: " + customers.get(i).getOrderList().get(j).getNumber()+'\n');
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }

    //Ham display
    public static void display(List<Customer> customers) {
//        System.out.printf("%-20s %-15s %-15s %n", "Customer Name", "Address", "Phone Number");
        for (int i = 0; i < customers.size(); i++) {
            System.out.printf("%-20s %-15s %-15s %n", "Customer Name", "Address", "Phone Number");
            System.out.printf("%-20s %-15s %-15s %n", customers.get(i).getName(), customers.get(i).getAddress(), customers.get(i).getPhoneNumber());
            System.out.println("Order List: ");
            for (int j = 0; j < customers.get(i).getOrderList().size(); j++) {
                System.out.print("Order [" + (j + 1) + "]: ");
                System.out.print("Date: " + customers.get(i).getOrderList().get(j).getDate() + " ");
                System.out.print("Number: " + customers.get(i).getOrderList().get(j).getNumber() + "\n");
            }
        }
    }

    public static List<Customer> search(String phone) {
        List<Customer> listSearch = new ArrayList<Customer>();
        for (Customer c : list) {
            if (c.getPhoneNumber().equals(phone)) {
                listSearch.add(c);
            }
        }
        return listSearch;
    }

    //Ham xoa khach hang
    public static boolean remove(String phone) {
        for (Customer customer : list) {
            if (customer.getPhoneNumber().equals(phone)) {
                list.remove(customer);
                return true;
            }
        }
        return false;
    }

}
