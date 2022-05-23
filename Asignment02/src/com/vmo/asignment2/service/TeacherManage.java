package com.vmo.asignment2.service;

import com.vmo.asignment2.entities.Teacher;

import static com.vmo.asignment2.PersonManage.input;
import static com.vmo.asignment2.entities.Teacher.caculateSalary;
import static com.vmo.asignment2.utils.Validation.sc;

public class TeacherManage {
    public static Teacher inputTeacher() {
        Teacher teacher = new Teacher();
        input(teacher);
        System.out.println("Nhap luong co ban : ");
        teacher.setBassicSalary(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap luong thuong : ");
        teacher.setSubsidy(Double.parseDouble(sc.nextLine()));
        return teacher;
    }

    public static void display(Teacher[] teachers) {
        for (Teacher tea : teachers) {
            System.out.println(tea.toString());
        }
    }

    public static void displaySalary(Teacher[] teachers) {
        for (Teacher tea : teachers) {
            if (caculateSalary(tea) > 1000) {
                System.out.println(tea.toString());
            }
        }
    }

}
