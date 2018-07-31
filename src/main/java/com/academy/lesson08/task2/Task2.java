package com.academy.lesson08.task2;

public class Task2 {
    public static void main(String[] args) {
        Week Date = Week.MONDAY;
        System.out.println("You Choise " + Date.getName());
        System.out.println("After Tomorrow: " + Date.afterTomorrow());
        System.out.println("Before Yesterday: " + Date.beforeYesterday());
    }
}