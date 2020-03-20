package com.template.behavioral.memento;

public class Memento {
    private boolean state;

    public Memento(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }
}
