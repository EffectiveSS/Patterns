package com.template.creational.factory.abstrakt;

import com.template.creational.factory.abstrakt.car.Car;

/**
 * @author Oleksiy
 */
public interface AbstractFactory {

    /**
     * @param name - desired car
     * @return object Car
     */
    Car createCar(String name);

}
