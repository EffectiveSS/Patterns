package com.template.creational.factory.abstrakt.car;

import com.template.creational.factory.abstrakt.AbstractFactory;
import com.template.creational.factory.abstrakt.car.buy.Reno;
import com.template.creational.factory.abstrakt.car.buy.Scania;
import com.template.creational.factory.abstrakt.car.type.ITrackful;

/**
 * @author Oleksiy Zhurko
 */
public final class Truckful implements AbstractFactory {

    public ITrackful createCar(String name) {
        switch (name) {
            case "Scania":
                return new Scania();
            case "Reno":
                return new Reno();
            default:
                throw new NullPointerException("\nSuch a machine does not exist");
        }
    }
}
