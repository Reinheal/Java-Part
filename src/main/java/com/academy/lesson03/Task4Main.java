package com.academy.lesson03;

import java.util.Scanner;

public class Task4Main {
    public static void main(String[] args) {
        System.out.println("Введите строку ");
        Scanner str= new Scanner(System.in);
        String text = str.nextLine();
        System.out.println(text);
        System.out.println(text.replaceAll("[^a-z,^A-Z,^\\s]",""));
        System.out.println(text.replaceAll("[^0-9,^\\s]",""));


    }
}
