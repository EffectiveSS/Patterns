package com.template.behavioral.strategy;

public class MainStrategy {

    public static void main(String[] args) {
        Volly volly = new Volly(new Move());

        volly.execute();

        volly.setActivity(new Sleep());

        volly.execute();
    }

}
