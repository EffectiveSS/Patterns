package com.template.creational.factory.abstrakt.car.buy;

import com.template.creational.factory.abstrakt.car.type.IOffroadster;

public class RangeRover implements IOffroadster {
    public void rideCar() {
        System.out.println("RangeRover\t" + type.toString().toLowerCase());
    }
}
