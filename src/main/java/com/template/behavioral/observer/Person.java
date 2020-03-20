package com.template.behavioral.observer;

import java.util.List;

public class Person implements Observer {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("We have something new for you!!!");
        System.out.println(vacancies);
    }
}
