package com.academy.lesson14.Task;

public class LambdaDem3 {
    public static void main(String[] args) {
        String str = "rtwe tywqeyi oqiuwey qweee";

        StrUpp strUpp = str1 -> str1.toUpperCase();

        System.out.println(strUpp.function(str));
      //  System.out.println(str,String::toUpperCase);
    }
    interface StrUpp{

        String function(String str);
    }
}
