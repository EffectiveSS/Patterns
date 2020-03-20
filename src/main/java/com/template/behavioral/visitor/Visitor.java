package com.template.behavioral.visitor;

public class Visitor implements IVisitor {

    @Override
    public void moveForward() {
        System.out.println("move forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("move backward");
    }
}
