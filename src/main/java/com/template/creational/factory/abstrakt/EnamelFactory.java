package com.template.creational.factory.abstrakt;

import com.template.creational.factory.abstrakt.kitchenware.*;

public class EnamelFactory implements AbstractFactory {

    @Override
    public Kitchenware createSaucepan() {
        return new EnamelSaucepan();
    }

    @Override
    public Kitchenware createPan() {
        return new EnamelPan();
    }

}
