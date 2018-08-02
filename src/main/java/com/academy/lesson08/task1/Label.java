package com.academy.lesson08.task1;

import com.academy.lesson08.task1.Component;

public class Label extends Component {
    @Override
    public void draw() {
        System.out.println("Label");
    }

    @Override
    public void draw3d() {
        System.out.println("Label Draw3d");
    }
}
