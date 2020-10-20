package com.template.creational.factory.abstrakt;

import com.template.creational.factory.abstrakt.kitchenware.*;

public class CeramicFactory implements AbstractFactory {

    @Override
    public Kitchenware createSaucepan() {
        return new CeramicSaucepan();
    }

    @Override
    public Kitchenware createPan() {
        return new CeramicPan();
    }

}
