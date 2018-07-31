package com.academy.lesson02;



public class LengthMain {
    public static void main(String[] args) {
        String n = "219";
        Integer a = Integer.valueOf(n);
        int b = ((a%10)+((a/10)%10)+(a/100));
        System.out.print("Длинна"+"-");
        System.out.println(n.length());
        System.out.println("Сумма цифр в числе\t"+b);
    }
}
