package com.academy.lesson11.Task1;

public class TimeImplSeconds implements Time {
        private int secondsAfterMidnight;
        private int curSec;
        private  int curMin;
        private  int curHour;


        @Override
        public void setTime ( int hours, int minutes, int seconds){
            this.curHour = hours;
            this.curMin = minutes;
            this.curSec = seconds;

        }


    @Override
    public String getTime(TimeFormat timeFormat) {
        if (timeFormat == TimeFormat.HOUR_12 && (curHour >= 0 && curHour <= 12)) {

            String hor = String.format("%02d",curHour);
            String min = String.format("%02d",curMin);
            String sec = String.format("%02d",curSec);
            String str1 = (hor+":"+min+":"+sec+"am");
            System.out.println(str1);

            return str1;
        } else if (timeFormat == TimeFormat.HOUR_12 && (curHour > 12 && curHour <= 23)) {

            curHour -= 12;
            String hor = String.format("%02d",curHour);
            String min = String.format("%02d",curMin);
            String sec = String.format("%02d",curSec);
            String str2 = (hor+":"+min+":"+sec+"pm");
            System.out.println(str2);
            return  str2;

        } else if (timeFormat == TimeFormat.HOUR_24) {
            String hor = String.format("%02d",curHour);
            String min = String.format("%02d",curMin);
            String sec = String.format("%02d",curSec);
            String str3 = (hor+":"+min+":"+sec);
            System.out.println(str3);
            return str3;
        }
        else
            return "error";

    }

    private void toSeconds (int h, int m, int s){
            secondsAfterMidnight = s + m * 60 + h * 60 * 60;
        }

        private int currentSecond () {
            curSec = secondsAfterMidnight%60;
            return curSec; // Current Seconds
        }


        private int currentMinute (){
            curSec = (secondsAfterMidnight/60)%60;
            return curMin ; // Current minutes
        }

        private int currentHour () {
            curHour = ((secondsAfterMidnight/60)/60)%60;
            return curHour; // Current Hours
        }
    }
