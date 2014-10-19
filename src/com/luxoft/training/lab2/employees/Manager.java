package com.luxoft.training.lab2.employees;


import com.luxoft.training.utils.Date;


public class Manager extends Employee {

    private double commissionValue;
    private int salesAmount;
    private double baseSalary;

    public Manager(String firstName, String lastName, Date birthDate, int salesAmount, double commissionValue, double baseSalary) {
        super(firstName, lastName, birthDate);
        setPosition("manager in department Finance Department");
        setPaymentType("commission and base salary");
        this.salesAmount = salesAmount;
        this.commissionValue = commissionValue;
        this.baseSalary = baseSalary;
    }

    @Override
    public double paymentCalc() {
        setPayment((commissionValue * salesAmount) / 100 + baseSalary);
        return getPayment();
    }
    @Override
    public void paymentInfo() {
        System.out.println("sales amount: " + salesAmount);
        System.out.println("commission: " + commissionValue);
        System.out.println("base salary: " + baseSalary);
        System.out.println("payment: " + getPayment());
        System.out.println();
    }
}