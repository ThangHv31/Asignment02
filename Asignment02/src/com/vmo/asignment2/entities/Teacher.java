package com.vmo.asignment2.entities;

public class Teacher extends Person {
    private double bassicSalary;
    private double subsidy;

    public static double caculateSalary(Teacher teacher) {
        double salary = teacher.getBassicSalary() + teacher.getSubsidy();
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher [" +
                "Ten= " + getName() + ", " +
                "Gioi Tinh= " + getGender() + ", " +
                "So dien thoai= " + getPhoneNumber() + ", " +
                "Email= " + getEmail() + ", " +
                "bassicSalary= $" + bassicSalary + ", " +
                "subsidy=" + subsidy +
                "]" + "\n";
    }

    public Teacher() {
    }

    public Teacher(String name, String gender, String phoneNumber, String email, double bassicSalary, double subsidy) {
        super(name, gender, phoneNumber, email);
        this.bassicSalary = bassicSalary;
        this.subsidy = subsidy;
    }

    public double getBassicSalary() {
        return bassicSalary;
    }

    public void setBassicSalary(double bassicSalary) {
        this.bassicSalary = bassicSalary;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }

}
