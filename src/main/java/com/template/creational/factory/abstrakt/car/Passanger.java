package com.template.creational.factory.abstrakt.car;

import com.template.creational.factory.abstrakt.AbstractFactory;
import com.template.creational.factory.abstrakt.car.buy.Audi;
import com.template.creational.factory.abstrakt.car.buy.Tesla;
import com.template.creational.factory.abstrakt.car.type.IPassanger;

/**
 * @author Oleksiy Zhurko
 */
public final class Passanger implements AbstractFactory {

    public IPassanger createCar(String name) {
        switch (name) {
            case "Audi":
                return new Audi();
            case "Tesla":
                return new Tesla();
            default:
                throw new NullPointerException("\nSuch a machine does not exist");
        }
    }

}
