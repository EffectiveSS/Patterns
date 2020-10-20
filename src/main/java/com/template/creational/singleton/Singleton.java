package com.template.creational.singleton;

public class Singleton {

    private String name;

    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        name = "Singleton";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }

}
