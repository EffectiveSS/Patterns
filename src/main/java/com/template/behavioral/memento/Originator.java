package com.template.behavioral.memento;

public class Originator {

    private boolean state;

    public Originator() {
        this.state = true;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this, state);
    }

}
