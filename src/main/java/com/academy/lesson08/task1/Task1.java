package com.academy.lesson08.task1;

import com.academy.lesson08.task1.*;

public class Task1 {
    public static void main(String[] args) {
        Component[] components = new Component[12];
        components[0] = new Label();
        components[1] = new Button();
        components[2] = new RoundButton();
        components[3] = new CheckBox();
        components[4] = new Label();
        components[5] = new Button();
        components[6] = new RoundButton();
        components[7] = new CheckBox();
        components[8] = new Label();
        components[9] = new Button();
        components[10] = new RoundButton();
        components[11] = new CheckBox();
        System.out.println("Все компоненты");
        for (int i = 0; i < components.length; i++)
            components[i].draw();
        System.out.println("***********************");
        System.out.println("Button и наследники ");
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof Button)
                (components[i]).draw();
        }
    }
}