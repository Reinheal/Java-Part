package com.academy.lesson02;

import java.util.Scanner;

public class MoonMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ваш вес: ");
        double mass = in.nextInt();
        double massmoon = (mass/100)*17;
        System.out.println("Ваш вем с на Луне: "+massmoon);
    }
}
