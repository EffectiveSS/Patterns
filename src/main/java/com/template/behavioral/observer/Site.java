package com.template.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Site implements Observed {

    private final List<String> goods;
    private final List<Person> subscribers;

    public Site() {
        goods = new ArrayList<>();
        subscribers = new ArrayList<>();
    }

    public void addGoods(String good) {
        goods.add(good);
        notifyPerson();
    }

    @Override
    public void addPerson(Person person) {
        subscribers.add(person);
    }

    @Override
    public void notifyPerson() {
        subscribers.forEach(person -> person.handleEvent(goods));
    }

}
