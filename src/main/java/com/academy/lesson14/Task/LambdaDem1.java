package com.academy.lesson14.Task;

public class LambdaDem1 {public static void main(String[] args) {
    PredicateInt predicateInt = n -> {
        if (n >= 10 && n <= 20)
            return true;
        return false;

    };



    System.out.println(predicateInt.function(15));
}
    interface PredicateInt{
        boolean function(int n);
    }

}