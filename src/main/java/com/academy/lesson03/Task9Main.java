package com.academy.lesson03;

import java.util.Scanner;

public class Task9Main {
    public static void main(String[] args) {
        System.out.println("Введите строку ");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String correct = string.trim().toLowerCase();
        //replaseAll() не осили придумать регулярку вернее правильно ее записать что бы воткнуть точки перед заглавными
        System.out.println(correct);
        String[] words = correct.split(" ");
        for (String c: words)
            if (c.startsWith("ь"))
                System.out.println(c);
    }
}