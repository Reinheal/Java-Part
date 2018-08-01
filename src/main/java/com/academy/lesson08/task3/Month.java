package com.academy.lesson08.task3;

public enum Month {
    JANUARY("Январь", "Січень", 31),
    FEBRUARY("Февраль", "Лютий", 28),
    MARCH("Март", "Березень", 31),
    APRIL("АПРЕЛЬ", "Квітень", 30),
    MAY("Май", "Травень", 31),
    JUNE("Июнь", "Червень", 30),
    JULY("Июль", "Липень", 31),
    AUGUST("Август", "Серпень", 31),
    SEPTEMBER("Сентябрь", "Вересень", 30),
    OCTOBER("Октябрь", "Жовтень", 31),
    NOVEMBER("Ноябрь", "Листопад", 30),
    DECEMBER("Декабрь", "Грудень", 31);
    private String ruName;
    private String ukrName;
    private int quantity;

    Month(String ruName, String ukrName, int quantity) {
        this.ruName = ruName;
        this.ukrName = ukrName;
        this.quantity = quantity;

    }

    public String getRuName() {
        return ruName;
    }

    public void setRuName(String ruName) {
        this.ruName = ruName;
    }

    public String getUkrName() {
        return ukrName;
    }

    public void setUkrName(String ukrName) {
        this.ukrName = ukrName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    String getNameRu(){
        System.out.println("Название на русском "+ruName);
        return ruName;
    }
    String getNameUa(){
        System.out.println("Название на украинском "+ukrName);
        return ukrName;
    }

   public Month getNextMonth() {
        Month mon = values()[(ordinal() + 1) % values().length];
       System.out.println("Next Mouth "+ mon);
       return mon;
   }
    public Month getPrevMonth() {
        Month mon1 = values()[(ordinal()+values().length - 1) % values().length];
        System.out.println("Previous Month " + mon1);
        return mon1;
    }

    }