package com.template.behavioral.template;

public class Volly extends AbstractTemplate {

    @Override
    public void moveHorizontal() {
        System.out.println("Move left");
        System.out.println("Move right");
    }

    @Override
    public void moveVertical() {
        System.out.println("Move up");
        System.out.println("move down");
    }

}
