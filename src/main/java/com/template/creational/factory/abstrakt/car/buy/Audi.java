package com.template.creational.factory.abstrakt.car.buy;


import com.template.creational.factory.abstrakt.car.type.IPassanger;

public class Audi implements IPassanger {
    public void rideCar() {
        System.out.println("Audi\t" + type.toString().toLowerCase());
    }
}
