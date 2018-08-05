package com.academy.lesson11.Task2;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;

public class RandomArr {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = 1 + Math.random() * 14;}
        for (double n:arr){
            System.out.println(n);
        }


    }

}
