package com.template.behavioral.visitor;

public class MainVisitor {

    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        Move one = new Enemy();
        Move two = new Ally();

        one.move(visitor);
        two.move(visitor);
    }

}
