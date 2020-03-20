package com.template.behavioral.strategy;

public class Sleep implements Activity {
    @Override
    public void doSomething() {
        System.out.println("sleep");
    }
}
