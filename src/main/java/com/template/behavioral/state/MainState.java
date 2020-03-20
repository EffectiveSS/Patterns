package com.template.behavioral.state;

public class MainState {
    public static void main(String[] args) {
        Phone iPhone = new Phone("XR", new PowerOff());
        iPhone.getState();
        iPhone.setState(new PowerOn());
        iPhone.getState();
    }
}
