package com.template.behavioral.command;

public class Sleep implements Activity {
    @Override
    public void work() {
        System.out.println("sleep");
    }
}
