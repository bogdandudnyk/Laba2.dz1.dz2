package com.luxoft.training.homework2;


import com.luxoft.training.utils.Date;

public class LabDemo {

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(4, 11, 2011);
        Date date3 = new Date(date2);
        Date date4 = new Date();

        System.out.println("дата без параметров: " + date1.printDate());
        System.out.println("дата с заданными параметрами: " + date2.printDate());
        System.out.println("дата заданная другой датой: " + date3.printDate());


        date4.setDate(23, 9, 2000);
        System.out.println("установка новой даты: " + date4.printDate());

        date3.incDay(99);
        System.out.println("увеличение даты: " + date3.printDate());

        date1.decDay(66);
        System.out.println("уменьшение даты: " + date1.printDate());

        System.out.println("колличество месяцев между датами: " + Date.monthCount(new Date(14, 4, 1944), new Date()));
    }
}
