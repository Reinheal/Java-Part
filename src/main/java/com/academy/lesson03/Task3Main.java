package com.academy.lesson03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3Main {
    public static void main(String[] args) {
        System.out.println("Строка 1 ");
        Scanner scan1 = new Scanner(System.in);
        String st1 = scan1.nextLine();
        String st2 = "это уже было";
        System.out.println(st1);
        System.out.println(st2);
        String st3 = st1+" "+st2;
        System.out.println(st3);
        Pattern pat = Pattern.compile("это уже было");
        Matcher mat= pat.matcher(st3);
        int count =0;
        while (mat.find());
        count++;
        System.out.println(count);
    }
}
