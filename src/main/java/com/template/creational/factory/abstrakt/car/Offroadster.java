package com.template.creational.factory.abstrakt.car;

import com.template.creational.factory.abstrakt.AbstractFactory;
import com.template.creational.factory.abstrakt.car.buy.Mercedes;
import com.template.creational.factory.abstrakt.car.buy.RangeRover;
import com.template.creational.factory.abstrakt.car.type.IOffroadster;

/**
 * @author Oleksiy Zhurko
 */
public final class Offroadster implements AbstractFactory {

    public IOffroadster createCar(String name) {
        switch (name) {
            case "RangeRover":
                return new RangeRover();
            case "Mercedes":
                return new Mercedes();
            default:
                throw new NullPointerException("\nSuch a machine does not exist");
        }
    }

}
