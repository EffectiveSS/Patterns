package com.template.behavioral.state;

public class Phone {

    private Boolean state;
    private final String name;
    private final IState stateOn = new PowerOn();
    private final IState stateOff = new PowerOff();

    public Phone(String name, Boolean state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void execute() {
        if (state) {
            stateOff.doAction();
            state = false;
        } else {
            stateOn.doAction();
            state = true;
        }
    }

}
