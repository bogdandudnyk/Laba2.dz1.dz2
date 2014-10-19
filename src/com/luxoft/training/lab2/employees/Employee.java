package com.luxoft.training.lab2.employees;


import com.luxoft.training.utils.Date;


public abstract class Employee implements Comparable {
    private String firstName;
    private String lastName;
    private Date birth;
    private String position;
    private double payment;
    private String paymentType;


    public Employee(String firstName, String lastName, Date birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
    }

    public abstract double paymentCalc();

    public abstract void paymentInfo();

    public void printEmployeeInfo() {
        System.out.println("first name: " + getFirstName());
        System.out.println("last name: " + getLastName());
        System.out.println("position: " + getPosition());
        System.out.println("date of birth: " + getBirth().printDate());
        System.out.println("payment type: " + getPaymentType());
        paymentInfo();
    }

    @Override
    public int compareTo(Object obj) {
        Employee entry = (Employee) obj;

        int result = lastName.compareTo(entry.lastName);
        if (result != 0) {
            return result;
        }

        return 0;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}