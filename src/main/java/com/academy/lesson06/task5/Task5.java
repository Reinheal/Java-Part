package com.academy.lesson06.task5;


public class Task5 {
    public static void main(String[] args) {
        Date date1 = new Date(25, 10, 2015);
        Date date2 = new Date(10, 11, 1903);
        Date date3 = new Date(3, 9, 2001);
        date1.printDate();
        date2.printDate();
        date3.printDate();
        date1.differenceIdDays(date3);

    }
}