package com.template.behavioral.state;

public class PowerOn implements IState {
    @Override
    public void doAction() {
        System.out.println("power on");
    }
}
