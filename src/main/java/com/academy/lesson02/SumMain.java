package com.academy.lesson02;

public class SumMain {
    public static void main(String[] args) {
        int a = 219;
        System.out.println("Сумма цифр числа " + a +" равна "+((a%10)+((a/10)%10)+(a/100)));
    }
}
