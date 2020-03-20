package com.template.behavioral.observer;

public class MainObserver {
    public static void main(String[] args) {
        Site site = new Site();

        Person person1 = new Person("Mark");
        Person person2 = new Person("Peter");

        site.addGoods("smartphone");
        site.addGoods("laptop");

        site.addPerson(person1);
        site.addPerson(person2);

        site.addGoods("watch");
    }
}
