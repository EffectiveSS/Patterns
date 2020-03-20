package com.template.behavioral.memento;

public class MainMemento {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState(true);
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());

        System.out.println(originator.getState());
        originator.setStateMemento(careTaker.getMemento());
        originator.setState(false);
        System.out.println(originator.getState());
    }
}
