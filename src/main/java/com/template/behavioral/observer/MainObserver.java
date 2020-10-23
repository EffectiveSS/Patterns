package com.template.behavioral.observer;

import java.util.List;

public class MainObserver {

    public static void main(String[] args) {
        Site site = new Site();
        Person person = new Person("Mark");

        site.addGoods("smartphone");

        site.addPerson(person);

        site.addGoods("laptop");
        site.addGoods("watch");
    }

}
