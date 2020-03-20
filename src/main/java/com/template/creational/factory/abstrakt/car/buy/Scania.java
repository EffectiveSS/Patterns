package com.template.creational.factory.abstrakt.car.buy;

import com.template.creational.factory.abstrakt.car.type.ITrackful;

public class Scania implements ITrackful {
    public void rideCar() {
        System.out.println("Scania\t" + type.toString().toLowerCase());
    }
}
