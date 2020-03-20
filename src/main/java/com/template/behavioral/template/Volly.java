package com.template.behavioral.template;

public class Volly extends AbstractTemplate {
    @Override
    public void moveHorizontal() {
        System.out.println("move left");
        System.out.println("move right");
    }

    @Override
    public void moveVertical() {
        System.out.println("move up");
        System.out.println("move down");
    }
}
