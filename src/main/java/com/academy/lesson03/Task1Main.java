package com.academy.lesson03;

import java.util.Scanner;

public class Task1Main {
    public static void main(String[] args) {
        System.out.println("Строка ");
        Scanner str = new Scanner(System.in);
        String st = str.nextLine();
        String[] words = st.split(" ");
        System.out.println(st);
        for (String c: words)
            if (c.startsWith("d"))
        System.out.println(c);
        int count=0;
        for (String g:words)
            if (g.startsWith("d"))
                count++;
        System.out.println(count);

    }
}