package com.template.behavioral.state;

public class MainState {

    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 12 Pro", false);

        iPhone.execute();
        iPhone.execute();
    }

}
