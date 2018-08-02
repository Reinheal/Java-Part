package com.academy.lesson08.task1;

import com.academy.lesson08.task1.Button;

public class RoundButton extends Button {
    public void draw(){
        System.out.println("RoundButton");
    }

    @Override
    public void draw3d() {
        super.draw3d();
    }
}
