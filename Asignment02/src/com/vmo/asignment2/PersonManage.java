package com.vmo.asignment2;

import com.vmo.asignment2.entities.Person;
import com.vmo.asignment2.entities.Student;
import com.vmo.asignment2.entities.Teacher;
import com.vmo.asignment2.service.StudentManage;
import com.vmo.asignment2.utils.Validation;

import static com.vmo.asignment2.service.StudentManage.*;
import static com.vmo.asignment2.service.TeacherManage.*;
import static com.vmo.asignment2.utils.Validation.sc;

public class PersonManage {
    public static void input(Person person) {
        boolean status;
        System.out.println("Nhap ten: ");
        person.setName(sc.nextLine());

        System.out.println("Nhap gioi tinh: ");
        person.setGender(sc.nextLine());
        do {
            System.out.println("Nhap so dien thoai: ");
            person.setPhoneNumber(sc.nextLine());
            if (Validation.validateNumber(person.getPhoneNumber())) {
                status = false;
            } else {
                status = true;
            }
        } while (status);
        do {
            System.out.println("Nhap email: ");
            person.setEmail(sc.nextLine());
            if (Validation.validateEmail(person.getEmail())) {
                status = false;
            } else {
                status = true;
            }
        } while (status);

    }

    public static void main(String[] args) {
        // Nhap danh sach giao vien
        Teacher[] teachers = new Teacher[2];
        System.out.println("Nhap danh sach giao vien: ");
        for (int i = 0; i < teachers.length; i++) {
            System.out.println("Nhap giao vien [" + (i + 1) + "]");
            teachers[i] = inputTeacher();
        }
        // Nhap danh sach sinh vien
        Student[] students = new Student[2];
        System.out.println("Nhap danh sach sinh vien: ");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Nhap sinh vien [" + (i + 1) + "]");
            students[i] = inputStudent();
        }

        // Update thong tin sinh vien
        System.out.println("Nhap ma sinh vien can sua: ");
        String id = sc.nextLine();
        update(findById(students, id));
        System.out.println("Thong tin sinh vien sau khi sua: ");
        StudentManage.display(students);

        // Hien thi giao vien co luong > 1000
        System.out.println("Danh sach giao vien co luong > 1000");
        displaySalary(teachers);

        // Danh sach sinh vien co diem >= 6
        System.out.println("Danh sach sinh vien co diem >= 6");
        displayMark(students);
    }
}
