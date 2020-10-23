package com.template.behavioral.observer;

import java.util.List;

public class Person implements Observer {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> goods) {
        System.out.println(name + ", we have something new for you!!!");
        System.out.println(goods + "\n");
    }

}
