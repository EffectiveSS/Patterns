package com.template.behavioral.visitor;

public class Visitor implements IVisitor {

    @Override
    public void moveForward() {
        System.out.println("Move forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Move backward");
    }

}
