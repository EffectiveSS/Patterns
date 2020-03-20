package com.template.creational.factory.abstrakt;

import com.template.creational.factory.abstrakt.car.Car;
import com.template.creational.factory.abstrakt.car.Offroadster;

public class MainAbstract {
    public static void main(String[] args) {
        AbstractFactory factory = new Offroadster();
        Car car = factory.createCar("RangeRover");
        car.rideCar();
    }
}
