package com.template.behavioral.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Volly volly = new Volly();
        volly.setActivity(new Move());
        volly.executeSomething();
        volly.setActivity(new Sleep());
        volly.executeSomething();
    }
}
