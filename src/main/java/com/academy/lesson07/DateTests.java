package com.academy.lesson07;


public class DateTests {
    public static void main(String[] args) {
        testLeap();
    }

    private static void testLeap() {
        int[] leapYears = {2004, 2008, 2000, 4};
        int[] notLeapYears = {2003, 2009, 2100, 2007};

        for (int notLeapYear : notLeapYears) {
            Data date = new Data(notLeapYear, 1, 1);
            System.out.println("check: "+ notLeapYear);
            assert !date.isLeap();
        }

        for (int leapYear : leapYears) {
            Data date = new Data(leapYear, 1, 1);
            System.out.println("check: " + leapYear);
        }
    }
}