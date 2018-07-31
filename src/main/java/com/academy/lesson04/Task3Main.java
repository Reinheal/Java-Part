package com.academy.lesson04;

import java.util.regex.Pattern;

public class Task3Main {
    public static void main(String[] args) {

        String d1 = "2012/09/18 12:10";
        String d2 = "2013/9/09 09:09";
        String regx = "(\\d{4}\\/\\d{2}\\/\\d{2}\\s\\d{2}\\:\\d{2})";

        Date(regx, d1);
        Date(regx, d2);
    }


    public static void Date(String regx, String date){

        boolean result = Pattern.matches(regx, date);
        System.out.println(result+" " + date);

    }
}

