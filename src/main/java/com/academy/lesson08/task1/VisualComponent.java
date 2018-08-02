package com.academy.lesson08.task1;

public interface VisualComponent {
    void draw();
    default void draw3d(){
        System.out.println("Void Draw3d");
    }
}
