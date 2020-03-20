package com.template.creational.factory.abstrakt.car.type;

import com.template.creational.factory.abstrakt.car.Car;

/**
 * @author Oleksiy Zhurko
 */
public interface ITrackful extends Car {
    /**
     * type - type of this car
     */
    TypeCar type = TypeCar.TRUCKFUL;
}
