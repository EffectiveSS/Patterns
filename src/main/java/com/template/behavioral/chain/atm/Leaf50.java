package com.template.behavioral.chain.atm;

public class Leaf50 extends Cash {

    public static final Leaf50 LEAF_50 = new Leaf50();

    private Leaf50() {
        super(MoneyLeaf.FIFTY);
    }

}
