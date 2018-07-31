package com.academy.lesson03;

import java.util.Scanner;

public class Task2Main {
    public static void main(String[] args) {
        System.out.println("Строка ");
        Scanner str = new Scanner(System.in);
        String st = str.nextLine();
        String[] words = st.split(" ");
        System.out.println(st);
        int count=0;
        for (String v: words)
            if (v.endsWith("ed"))
                System.out.println(v);
        for (String g:words)
            if (g.endsWith("ed"))
                count++;
        System.out.println(count);

    }
}
