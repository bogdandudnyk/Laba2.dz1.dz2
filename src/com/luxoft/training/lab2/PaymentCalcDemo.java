package com.luxoft.training.lab2;

import com.luxoft.training.lab2.employees.*;

import com.luxoft.training.utils.Date;
import com.luxoft.training.utils.Utils;


public class PaymentCalcDemo {

    public static void main(String[] args) {

        Employee[] employeesList = new Employee[4];
        employeesList[0] = new Director("Ivan", "Ivanov", new Date(2, 10, 1974), 10000, 12);
        employeesList[1] = new Tester("Alex", "Sidorov", new Date(22, 12, 1969), 120, 10);
        employeesList[2] = new Manager("Oleg", "Petrov", new Date(13, 2, 1979), 20000, 10, 5000);
        employeesList[3] = new Bookkeeper("Anna", "Boo", new Date(2, 11, 1976), 3000);

        Utils.sort(employeesList);

        for (Employee employee : employeesList) {
            employee.paymentCalc();
            employee.printEmployeeInfo();
        }

    }
}