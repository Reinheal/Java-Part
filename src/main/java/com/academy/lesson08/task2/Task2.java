package com.academy.lesson08.task2;

public class Task2 {
    public static void main(String[] args) {
        Week date = Week.MONDAY;
        System.out.println("You Choise " + date.getName());
        date.afterTomorrow();
        date.beforeYesterday();
    }
}