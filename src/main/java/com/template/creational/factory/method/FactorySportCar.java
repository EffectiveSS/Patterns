package com.template.creational.factory.method;

public class FactorySportCar implements FactoryMethod {

    @Override
    public Vehicle createVehicle() {
        return new SportCar();
    }

}
