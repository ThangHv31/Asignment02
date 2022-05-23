package com.vmo.asignment2.entities;

public class Student extends Person {
    private String studentID;
    private double theory;
    private double practice;

    public static double caculateFinalMark(Student student) {
        double finalMark = (student.getPractice() + student.getTheory()) / 2;
        return finalMark;
    }

    public Student() {
    }

    public Student(String name, String gender, String phoneNumber, String email, String studentID, double theory, double practice) {
        super(name, gender, phoneNumber, email);
        this.studentID = studentID;
        this.theory = theory;
        this.practice = practice;
    }

    @Override
    public String toString() {
        return "Student [" +
                "Ten = " + getName() + ", " +
                "Gioi Tinh = " + getGender() + ", " +
                "So dien thoai = " + getPhoneNumber() + ", " +
                "Email = " + getEmail() + ", " +
                "studentID = " + studentID + ", " +
                "theory = " + theory + ", " +
                "practice = " + practice +
                "]" + "\n";
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getTheory() {
        return theory;
    }

    public void setTheory(double theory) {
        this.theory = theory;
    }

    public double getPractice() {
        return practice;
    }

    public void setPractice(double practice) {
        this.practice = practice;
    }
}
