package com.academy.lesson03;

import java.util.Scanner;

public class Task6Main {
    public static void main(String[] args) {
        System.out.println("Введите строку ");
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
        String vowel = str.replaceAll("[^aeiouyAEIOUY]","");
        String consonant = str.replaceAll("[^qwrtpsdfghjklzxcvbnmQWRTPASDFGHJKLZXCVBNM]","");
        System.out.println(str);
        System.out.println("Гласных "+vowel.length());
        System.out.println("Согласных "+consonant.length());




    }
}
