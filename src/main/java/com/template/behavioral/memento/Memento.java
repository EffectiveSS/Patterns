package com.template.behavioral.memento;

public class Memento {

    private final Originator originator;
    private final boolean state;

    public Memento(Originator originator, boolean state) {
        this.originator = originator;
        this.state = state;
    }

    public void restore() {
        originator.setState(state);
    }

}
