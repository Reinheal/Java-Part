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
        if (this.name.equals(MONDAY.name))
            return WEDNESDAY.name;
        if (this.name.equals(TUESDAY.name))
            return THURSDAY.name;
        if (this.name.equals(WEDNESDAY.name))
            return FRIDAY.name;
        if (this.name.equals(THURSDAY.name))
            return SATURDAY.name;
        if (this.name.equals(FRIDAY.name))
            return SUNDAY.name;
        if (this.name.equals(SATURDAY.name))
            return MONDAY.name;
        if (this.name.equals(SUNDAY.name))
            return TUESDAY.name;
        return "Error";
    }
    public String beforeYesterday(){
        if (this.name.equals(MONDAY.name))
            return SATURDAY.name;
        if (this.name.equals(TUESDAY.name))
            return SUNDAY.name;
        if (this.name.equals(WEDNESDAY.name))
            return MONDAY.name;
        if (this.name.equals(THURSDAY.name))
            return TUESDAY.name;
        if (this.name.equals(FRIDAY.name))
            return WEDNESDAY.name;
        if (this.name.equals(SATURDAY.name))
            return THURSDAY.name;
        if (this.name.equals(SUNDAY.name))
            return FRIDAY.name;
        return "Error";
    }
}