package com.academy.lesson11.Task1;

public interface Time {

    void setTime(int hours, int minutes, int seconds)throws IncorrectTimeRange;
    String getTime(TimeFormat timeFormat);
}
