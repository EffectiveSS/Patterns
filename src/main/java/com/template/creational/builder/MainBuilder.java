package com.template.creational.builder;

public class MainBuilder {

    public static void main(String[] args) {
        Car tesla = Car.builder()
                .name("Tesla Model S")
                .wheels(4)
                .maxSpeed(305)
                .cost(100_000L)
                .build();

        Car rollsRoyce = Car.builder()
                .name("Rolls-Royce Exclusive")
                .wheels(4)
                .maxSpeed(180)
                .build();

        System.out.println(tesla.toString());
        System.out.println(rollsRoyce.toString());
    }

}
