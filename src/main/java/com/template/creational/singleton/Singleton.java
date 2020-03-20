package com.template.creational.singleton;

public class Singleton {
    private String name;

    private static Singleton singleton = new Singleton();

    private Singleton() {
        name = "Singleton";
    }

    public static Singleton getSingleton() { return singleton; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
