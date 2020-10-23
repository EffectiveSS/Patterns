package com.template.behavioral.chain.atm;

public class Leaf100 extends Cash {

    public static final Leaf100 LEAF_100 = new Leaf100();

    private Leaf100() {
        super(MoneyLeaf.ONE_HUNDRED);
    }

}
