package com.template.creational.singleton;

public class LazySingleton {

    private String name;

    private static LazySingleton singleton;

    private LazySingleton() {
        name = "Lazy Singleton";
    }

    public static LazySingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
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
