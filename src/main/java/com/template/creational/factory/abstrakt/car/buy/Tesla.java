package com.template.creational.factory.abstrakt.car.buy;

import com.template.creational.factory.abstrakt.car.type.IPassanger;

public class Tesla implements IPassanger {
    public void rideCar() {
        System.out.println("Tesla\t" + type.toString().toLowerCase());
    }
}
