package com.template.creational.factory.abstrakt.car.type;

import com.template.creational.factory.abstrakt.car.Car;

/**
 * @author Oleksiy Zhurko
 */
public interface IOffroadster extends Car {
    /**
     * type - type of this car
     */
    TypeCar type = TypeCar.OFFROADSTER;
}
