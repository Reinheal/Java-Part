package com.academy.lesson06.task3;

public class Task3a {
    public static void main(String[] args) {
        Currency cur1 = new Currency(100, "руб");
        Currency cur2 = new Currency(30,"руб");
        Currency cur3 = new Currency(150,"руб");
        Currency cur4 = new Currency(10,"$");
        Currency cur5 = new Currency(4,"руб");
        cur1.printCurr();
        cur2.printCurr();
        cur3.printCurr();
        cur4.printCurr();
        cur1.addCurrency(cur2);
        cur1.addCurrency(cur4);
        cur1.substrCurrency(cur2);
        cur3.divCurrency(cur2);
        cur1.multCurrency(cur5);





    }

}
