package com.academy.lesson04;

import java.util.regex.Pattern;

public class Task7Main {
    public static void main(String[] args) {

        String em1 = "tre123ACX@adyda.cor";
        String em2 = "gfsd@gh@d.tre";
        String em3 = "dERt11@.coer";
        String reg = "(\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,6})";

        checkmail(reg, em1);
        checkmail(reg, em2);
        checkmail(reg, em3);

    }

    public static void checkmail(String regexp, String mail) {

        boolean result = Pattern.matches(regexp, mail);

        if (result == false) {
            System.out.println("Incorrect "+mail);
        }

    }
}