package com.template.creational.factory.abstrakt.car.buy;

import com.template.creational.factory.abstrakt.car.type.IOffroadster;

public class Mercedes implements IOffroadster {
    public void rideCar() {
        System.out.println("Mercedes\t" + type.toString().toLowerCase());
    }
}
