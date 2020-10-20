package com.template.creational.factory.abstrakt.kitchenware;

import com.template.creational.factory.abstrakt.kitchenware.Kitchenware;

public class CeramicPan implements CeramicKitchenware {

    @Override
    public void cooking() {
        System.out.println("Ceramic pan fries vegetables");
    }

}
