package com.template.behavioral.chain.atm;

public class Leaf200 extends Cash {

    public static final Leaf200 LEAF_200 = new Leaf200();

    private Leaf200() {
        super(MoneyLeaf.TWO_HUNDRED);
    }

}
