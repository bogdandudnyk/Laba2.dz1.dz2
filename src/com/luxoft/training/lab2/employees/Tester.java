package com.luxoft.training.lab2.employees;


import com.luxoft.training.utils.Date;


public class Tester extends Employee {

    private double workingHours;
    private double hourlyRate;

    public Tester(String firstName, String lastName, Date birthDate, double workingHours, double hourlyRate) {
        super(firstName, lastName, birthDate);
        setPosition("tester in department IT Department");
        setPaymentType("hourly rate");
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double paymentCalc() {
        setPayment(workingHours * hourlyRate);
        return getPayment();
    }

    @Override
    public void paymentInfo() {
        System.out.println("working hours: " + workingHours);
        System.out.println("hourly rate: " + hourlyRate);
        System.out.println("payment: " + getPayment());
        System.out.println();
    }
}