package com.academy.lesson03;

import java.util.Scanner;

public class Task5Main {
    public static void main(String[] args) {
        System.out.println("Введите строку ");
        Scanner str = new Scanner(System.in);
        String st = str.nextLine();
        String revers = new StringBuffer(st).reverse().toString();
        System.out.println("Было "+st);
        System.out.println("Стало "+revers);
    }
}
