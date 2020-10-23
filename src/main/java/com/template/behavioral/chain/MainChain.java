package com.template.behavioral.chain;

import com.template.behavioral.chain.atm.*;

public class MainChain {

    public static void main(String[] args) {
        getCash(1850);
    }

    static void getCash(final int cash) {
        Cash L1000 = Leaf1000.LEAF_1000;
        Cash L500  = Leaf500.LEAF_500;
        Cash L200  = Leaf200.LEAF_200;
        Cash L100  = Leaf100.LEAF_100;
        Cash L50   = Leaf50.LEAF_50;

        L1000.setNext(L500);
        L500.setNext(L200);
        L200.setNext(L100);
        L100.setNext(L50);

        L1000.getCash(cash);
    }

}
