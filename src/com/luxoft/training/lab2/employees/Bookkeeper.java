package com.luxoft.training.lab2.employees;


import com.luxoft.training.utils.Date;


public class Bookkeeper extends Employee {

    private double baseSalary;

    public Bookkeeper(String firstName, String lastName, Date birthDate, double baseSalary) {
        super(firstName, lastName, birthDate);
        setPosition("bookkeeper in department Finance Department");
        setPaymentType("monthly salary");
        this.baseSalary = baseSalary;
    }


    @Override
    public double paymentCalc() {
        setPayment(baseSalary);
        return getPayment();
    }

    @Override
    public void paymentInfo() {
        System.out.println("salary: " + baseSalary);
        System.out.println("payment: " + getPayment());
        System.out.println();
    }
}
