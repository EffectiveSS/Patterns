package com.template.behavioral.visitor;

public class Enemy implements Move {

    @Override
    public void move(Visitor visitor) {
        visitor.moveBackward();
    }

}
