package com.template.creational.factory.abstrakt;

import com.template.creational.factory.abstrakt.kitchenware.Kitchenware;

public interface AbstractFactory {

    Kitchenware createSaucepan();

    Kitchenware createPan();

}
