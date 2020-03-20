package com.template.behavioral.visitor;

public class Ally implements Move {
    @Override
    public void move(Visitor visitor) {
        visitor.moveForward();
    }
}
