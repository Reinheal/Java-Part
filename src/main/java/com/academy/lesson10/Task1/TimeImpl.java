package com.academy.lesson10.Task1;

public class TimeImpl implements Time {
    private int h;
    private int m;
    private int s;


    @Override
    public void setTime(int hours, int minutes, int seconds) {

        this.h = hours;
        this.m = minutes;
        this.s = seconds;

    }

    @Override
    public String getTime(TimeFormat timeFormat) {
        if (timeFormat == TimeFormat.HOUR_12 && (h >= 0 && h <= 12)) {
            String hor = String.format("%02d",h);
            String min = String.format("%02d",m);
            String sec = String.format("%02d",s);
            String str1 = (hor+":"+min+":"+sec+"am");
            System.out.println(str1);
            return str1;

        } else if (timeFormat == TimeFormat.HOUR_12 && (h > 12 && h <= 23)) {

            h -= 12;
            String hor = String.format("%02d",h);
            String min = String.format("%02d",m);
            String sec = String.format("%02d",s);
            String str2 = (hor+":"+min+":"+sec+"pm");
            System.out.println(str2);
            return  str2;


        } else if (timeFormat == TimeFormat.HOUR_24) {
            String hor = String.format("%02d",h);
            String min = String.format("%02d",m);
            String sec = String.format("%02d",s);
            String str3 = (hor+":"+min+":"+sec);
            System.out.println(str3);
            return str3;
        } else
            return "error";


    }
}