package com.template.behavioral.state;

public class Phone {
    private String name;
    private IState state;

    public Phone(String name, IState state) {
        this.name = name;
        this.state = state;
    }

    public void getState() {
        state.doAction();
    }

    public void setState(IState state) {
        this.state = state;
    }
}
