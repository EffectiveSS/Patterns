package com.template.behavioral.chain.atm;

public class Leaf1000 extends Cash {

    public static final Leaf1000 LEAF_1000 = new Leaf1000();

    private Leaf1000() {
        super(MoneyLeaf.ONE_THOUSAND);
    }

}
