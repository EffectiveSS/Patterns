package com.template.creational.factory.method;

public class FactoryMethod {
    private FactoryMethod() {}

    public static FactoryMethod createFactoryMethod() {
        return new FactoryMethod();
    }
}
