package com.template.creational.factory.method;

public class MainFactoryMethod {

    public static void main(String[] args) {
        FactoryMethod producer = new FactorySportCar();

        Vehicle sportCar = producer.createVehicle();

        sportCar.move();
    }

}
