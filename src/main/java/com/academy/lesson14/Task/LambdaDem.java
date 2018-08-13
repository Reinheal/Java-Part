package com.academy.lesson14.Task;

public class LambdaDem {
    public static void main(String[] args) {

        String text = "Test  terra test terr ";

        RemoveSpaces rs = str -> str.replace(" ", "");

        String result = rs.function(text);
        System.out.println(result);
    }
    interface RemoveSpaces{

        String function(String str);
    }

}



