package com.academy.lesson08.task2;

public enum  Week {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private String name;
    Week(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    public String afterTomorrow(){
        Week we1 = values()[(ordinal() + 2) % values().length];
        System.out.println("After Tomorrow " + we1.getName());
        return toString();
    }
    public String beforeYesterday(){
        Week we2 = values()[(ordinal()+values().length - 2) % values().length];
        System.out.println("Before Yesterday " + we2.getName());
        return toString();
    }
}