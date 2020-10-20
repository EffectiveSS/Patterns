package com.template.creational.singleton;

public class DoubleCheckedSingleton {

    private String name;
    private static volatile DoubleCheckedSingleton singleton;

    private DoubleCheckedSingleton() {
        name = "Double Checked Singleton";
    }

    public static DoubleCheckedSingleton getDoubleCheckedSingleton() {
        DoubleCheckedSingleton localInstance = singleton;

        if (localInstance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                localInstance = singleton;

                if (localInstance == null) {
                    singleton = localInstance = new DoubleCheckedSingleton();
                }
            }
        }

        return localInstance;
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
