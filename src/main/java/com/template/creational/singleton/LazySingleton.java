package com.template.creational.singleton;

public class Singleton {

    private String name;

    private static Singleton singleton;

    private Singleton() {
        name = "Singleton";
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
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
