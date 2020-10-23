package com.template.behavioral.chain.atm;

public class Leaf500 extends Cash {

    public static final Leaf500 LEAF_500 = new Leaf500();

    private Leaf500() {
        super(MoneyLeaf.FIVE_HUNDRED);
    }

}
