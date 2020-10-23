package com.template.behavioral.state;

public class PowerOff implements IState {

    @Override
    public void doAction() {
        System.out.println("Power is off");
    }

}
