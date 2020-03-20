package com.template.behavioral.memento;

public class Originator {
    private boolean state;

    public boolean getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setStateMemento(Memento memento) {
        state = memento.getState();
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
