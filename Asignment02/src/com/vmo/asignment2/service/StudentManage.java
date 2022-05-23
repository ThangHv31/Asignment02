package com.vmo.asignment2.service;

import com.vmo.asignment2.entities.Student;

import static com.vmo.asignment2.PersonManage.input;
import static com.vmo.asignment2.entities.Student.caculateFinalMark;
import static com.vmo.asignment2.utils.Validation.sc;

public class StudentManage {
    public static Student inputStudent() {
        Student student = new Student();
        input(student);
        System.out.println("Nhap id: ");
        student.setStudentID(sc.nextLine());
        System.out.println("Nhap diem ly thuyet: ");
        student.setTheory(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap diem thuc hanh: ");
        student.setPractice(Double.parseDouble(sc.nextLine()));
        return student;
    }

    // tim kiem student trong mang theo id
    public static Student findById(Student[] students, String id) {
        for (Student s : students) {
            if (s.getStudentID().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public static void display(Student[] students) {
        for (Student stu : students) {
            System.out.println(stu.toString());
        }
    }

    // Ham hien thi sinh vien co diem >= 6
    public static void displayMark(Student[] students) {
        for (Student stu : students) {
            if (caculateFinalMark(stu) >= 6) {
                System.out.println(stu.toString());
            }
        }
    }

    // ham update student
    public static void update(Student student) {
        do {
            System.out.println("------SUA THONG TIN SINH VIEN-------");
            System.out.println("Chon mot thanh phan de sua");
            System.out.println("Chon 1: Sua ten ");
            System.out.println("Chon 2: Sua gioi tinh");
            System.out.println("Chon 3: Sua so dien thoai");
            System.out.println("Chon 4: Sua email");
            System.out.println("Chon 5: Sua diem li thuyet");
            System.out.println("Chon 6: Sua diem thuc hanh");
            System.out.println("Chon 0: Ket thuc");
            System.out.println("Lua chon cua ban: ");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Nhap ten moi: ");
                    student.setName(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Nhap gioi tinh moi: ");
                    student.setGender(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Nhap so dien thoai moi: ");
                    student.setPhoneNumber(sc.nextLine());
                    break;
                case 4:
                    System.out.println("Nhap email moi: ");
                    student.setEmail(sc.nextLine());
                    break;
                case 5:
                    System.out.println("Nhap diem li thuyet moi: ");
                    student.setTheory(Double.parseDouble(sc.nextLine()));
                    break;
                case 6:
                    System.out.println("Nhap diem thuc hanh moi: ");
                    student.setPractice(Double.parseDouble(sc.nextLine()));
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (true);
    }
}
