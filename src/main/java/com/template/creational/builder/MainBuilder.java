package com.template.creational.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Car car = new Car.Builder("Car", 1_000_000)
                .setWheels(6)
                .setMaxSpeed(300)
                .build();
    }
}
