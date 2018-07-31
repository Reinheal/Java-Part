package com.academy.lesson06.task4;

public class Task4 {
    public static void main(String[] args) {
        Abonent abon1 = new Abonent("Иванов","Иван",25,"M");
        Abonent abon2 = new Abonent(4502,"Сидоров","Сидор",37,"F");
        Abonent abon3 = new Abonent(3375,"Петров","Петр",49,"M");
        abon1.printInf();
        abon2.printInf();
        abon3.printInf();
        System.out.println(abon2.isEqual(abon3));
        System.out.println(abon1.isEqual(abon2));
        System.out.println(abon2.isEqual(abon2));
    }
}
