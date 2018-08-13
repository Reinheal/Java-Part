package com.academy.lesson14.Task;

public class LambdaDem2 {
    public static void main(String[] args) {
        FactorialInt factorial = n -> {

            int fact = 1;

            for (int i = 1; i <= n; i++) {

                fact *= i;

            }
            return fact;

        };

        System.out.println(factorial.function(5));
    }

}

interface FactorialInt{
    int function(int n);
}

