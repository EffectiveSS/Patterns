package com.template.creational.factory.abstrakt.kitchenware;

import com.template.creational.factory.abstrakt.kitchenware.Kitchenware;

public class EnamelPan implements EnamelKitchenware {

    @Override
    public void cooking() {
        System.out.println("Enamel pan fries vegetables");
    }

}
