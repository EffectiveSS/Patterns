package com.template.creational.factory.abstrakt.car.buy;

import com.template.creational.factory.abstrakt.car.type.ITrackful;

public class Reno implements ITrackful {
    public void rideCar() {
        System.out.println("Reno\t" + type.toString().toLowerCase());
    }
}
