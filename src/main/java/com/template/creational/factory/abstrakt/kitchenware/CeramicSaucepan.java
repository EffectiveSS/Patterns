package com.template.creational.factory.abstrakt.kitchenware;

import com.template.creational.factory.abstrakt.kitchenware.Kitchenware;

public class CeramicSaucepan implements CeramicKitchenware {

    @Override
    public void cooking() {
        System.out.println("Ceramic saucepan boils vegetables");
    }

}
