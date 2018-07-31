package com.academy.lesson08.task3;

public class Task03 {
    public static void main(String[] args) {
        Season win = Season.of(Month.APRIL);
        System.out.println("Your choice Season "+win);
        System.out.println();
        Season win1 = Season.WINTER;
        win1.getNextSeas();
        Season win2 = Season.SPRING;
        win2.getPrevSeas();
        Month  mon1 = Month.DECEMBER;
        System.out.println("Your choice Month "+mon1);
        mon1.getNameRu();
        mon1.getNameUa();
        mon1.getNextMonth();
        mon1.getPrevMonth();


    }
}
