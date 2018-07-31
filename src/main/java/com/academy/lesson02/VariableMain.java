package com.academy.lesson02;

public class VariableMain {
    public static void main(String[] args) {
        int a = 9;
        int b = 72;
        a = a + b;
        b = b - a;
        b = -b;
        a = a -b ;
        System.out.println("Было\t"+a+"\t"+"Стало\t"+b);
    }
}
