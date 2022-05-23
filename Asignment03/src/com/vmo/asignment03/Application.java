package com.vmo.asignment03;

import com.vmo.asignment03.entities.Customer;

import java.util.ArrayList;
import java.util.List;

import static com.vmo.asignment03.service.CustomerService.*;
import static com.vmo.asignment03.utils.Validation.sc;

public class Application {
    public static List<Customer> list = new ArrayList<Customer>();

    public static void main(String[] args) {

        do {
            System.out.println("======CHUONG TRINH QUAN LY KHACH HANG=======");
            System.out.println("Chon mot chuc nang : ");
            System.out.println("Phim 1: Them moi khach hang. ");
            System.out.println("Phim 2: Xem danh sach khach hang.");
            System.out.println("Phim 3: Tim kiem khach hang.");
            System.out.println("Phim 4: Xoa thong tin khach hang.");
            System.out.println("Phim 0: Thoat.");
            System.out.println("Lua chon cua ban:");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    createCustomer();
                    save(list);
                    break;
                case 2:
                    display(list);
                    break;
                case 3:
                    System.out.println("Nhap so dien thoai: ");
                    String sdtSearch = sc.nextLine();
                    display(search(sdtSearch));
                    break;
                case 4:
                    System.out.println("Nhap so dien thoai: ");
                    String sdtRemove = sc.nextLine();
                    if (remove(sdtRemove)){
                        System.out.println("Xoa thanh cong!");
                    }else {
                        System.out.println("Khong co so dien thoai trong danh sach");
                    }
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Lua chon khong chinh xac");
            }
        } while (true);
    }


}
