package com.template.creational.factory.abstrakt;

import com.template.creational.factory.abstrakt.kitchenware.Kitchenware;

public class MainAbstract {

    private static AbstractFactory kitchenwareFactory;

    public static void main(String[] args) {
        setFactory(CeramicFactory.class.getName());

        Kitchenware pan1 = kitchenwareFactory.createPan();
        Kitchenware saucepan1 = kitchenwareFactory.createSaucepan();

        pan1.cooking();
        saucepan1.cooking();

        setFactory(EnamelFactory.class.getName());

        Kitchenware pan2 = kitchenwareFactory.createPan();
        Kitchenware saucepan2 = kitchenwareFactory.createSaucepan();

        pan2.cooking();
        saucepan2.cooking();
    }

    static void setFactory(String cls) {
        kitchenwareFactory = switch (cls.substring(cls.lastIndexOf('.') + 1)) {
            case "EnamelFactory" -> new EnamelFactory();
            default -> new CeramicFactory();
        };
    }

}
