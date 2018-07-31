package com.academy.lesson02;

import java.util.Scanner;

public class PercMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Было: ");
        double num = in.nextInt();
        double ost = (num/100)*5;
        double ost1 = num-ost;
        System.out.println("Осталось\t"+ost1+"");

    }
}
