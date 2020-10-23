package com.template.behavioral.memento;

public class MainMemento {

    public static void main(String[] args) {
        Originator origin = new Originator();
        Memento memento = origin.createMemento();

        System.out.println(origin.getState());

        origin.setState(false);

        System.out.println(origin.getState());

        memento.restore();

        System.out.println(origin.getState());
    }

}
