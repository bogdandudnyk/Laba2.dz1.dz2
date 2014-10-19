package com.luxoft.training.lab2.employees;


import com.luxoft.training.utils.Date;


public class Director extends Employee {

    private double commissionValue;
    private int salesAmount;

    public Director(String firstName, String lastName, Date birthDate, int salesAmount, double commissionValue) {
        super(firstName, lastName, birthDate);
        setPosition("director in department IT Department");
        setPaymentType("commission");
        this.salesAmount = salesAmount;
        this.commissionValue = commissionValue;
    }

    @Override
    public double paymentCalc() {
        setPayment((commissionValue*salesAmount)/100);
        return getPayment();
    }

    @Override
    public void paymentInfo() {
        System.out.println("sales amount: " + salesAmount);
        System.out.println("commission: " + commissionValue);
        System.out.println("payment: " + getPayment());
        System.out.println();
    }
}