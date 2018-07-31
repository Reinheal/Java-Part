package com.academy.lesson03;

import java.util.Scanner;

public class Tasc8Main {
    public static void main(String[] args) {
        System.out.println("ВВедите строку ");
        Scanner str = new Scanner(System.in);
        String st = str.nextLine();
        String ts = new StringBuffer(st).reverse().toString();
        System.out.println(st.equals(ts));
    }
}
