package com.template.behavioral.template;

public abstract class AbstractTemplate {

    public abstract void moveHorizontal();

    public abstract void moveVertical();

    public void move() {
        moveHorizontal();
        moveVertical();
    }
}
