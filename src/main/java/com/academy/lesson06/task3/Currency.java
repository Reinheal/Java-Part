package com.academy.lesson06.task3;

/*
3а) Класс Currency для работы с денежными суммами.
        - Класс должен быть представлен двумя private полями:
        double value; для хранения значания суммы
        String name; для хранения названия валюты ("грн", "руб", "$")
        Реализовать 2 конструктора:
        - без параметров
        - и с двумя параметрами, которые принимает (double value, String name);
        - конструктор копирования: (Currency currency)
        - Реализовать метод отображения суммы на экран print();
        Напр. в виде: 154.65руб // отображать не более 2 знаков после запятой
        - Реализовать операцию сравнения:
        boolean isEqual(Currency currency); // вернет true, если и значение и строка - совпадают
        - Реализовать методы:
        void add(double value, String name); // метод сложения
        (если name отличается от текущего поля 'name', то сложение не производить,
        а вывести сообщение об ошибке ("Error: currency names are differ 'грн' - 'руб')
        void add(Currency currency); // метод сложения
        void substract(double value, String name); // метод вычитания ...
        void substract(Currency currency);
        void divide(double factor); // деление суммы на число
        void multiply(double factor); // умножение суммы на число
*/

public class Currency {

    private double value;
    private String name;  ///("грн", "руб", "$")


    // TODO check
    public Currency(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public Currency(Currency other) {
        this.value = other.value;
        this.name = other.name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    // TODO check
    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(String.format("%.2f%s", value, name));
    }

    public boolean isEqual(Currency other) {
        if (this.value != other.value)
            return false;

        if (!this.name.equals(other.name))
            return false;

        return true;
    }
// Сложение и проверка "грн,руб,$"
    public void addCurrency(Currency other) {
        double summ = (this.value + other.value);
        if (this.name.equals(other.name))
            System.out.println("Сумма " + summ + name);

        else
            System.out.println("Error: currency names are differ 'грн' - 'руб'");
        }
        //Вычитание
    public void substrCurrency(Currency other) {
        double subst = (this.value - other.value);
        if (this.name.equals(other.name))
            System.out.println("Остаток " + subst + name);

        else
            System.out.println("Error: currency names are differ 'грн' - 'руб'");
    }
    public void divCurrency(Currency other) {
        double div = (this.value / other.value);
        if (this.name.equals(other.name))
            System.out.println("Результат деления " + div + name);

        else
            System.out.println("Error: currency names are differ 'грн' - 'руб'");

    }
    public void multCurrency(Currency other) {
        double mult = (this.value * other.value);
        if (this.name.equals(other.name))
            System.out.println("Результат умножения " + mult + name);

        else
            System.out.println("Error: currency names are differ 'грн' - 'руб'");

    }

    public void printCurr(){
        System.out.println("Баланс " + value + name);
    }
}