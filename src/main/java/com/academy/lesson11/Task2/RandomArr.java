package com.academy.lesson11.Task2;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class RandomArr {
    public static void main(String[] args) {
        double[] arr = new double[10];
        BigDecimal[] bigDecimal = new BigDecimal[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = 1 + Math.random() * 14;
            bigDecimal[i] = BigDecimal.valueOf(arr[i]);
        }
        for (double n:arr) {
            System.out.println(n);
        }
        for (int i = 0; i <bigDecimal.length ; i++) {
            bigDecimal[i] = bigDecimal[i].setScale(3, RoundingMode.CEILING);
            System.out.println(bigDecimal[i]);
        }


    }

}
