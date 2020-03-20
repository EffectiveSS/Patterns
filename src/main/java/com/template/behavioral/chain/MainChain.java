package com.template.behavioral.chain;

public class MainChain {
    public static void main(String[] args) {
        Cash L500 = new Leaf500();
        Cash L200 = new Leaf200();
        Cash L100 = new Leaf100();
        Cash L50 = new Leaf50();
        Cash L20 = new Leaf20();
        Cash L10 = new Leaf10();
        Cash L5 = new Leaf5();
        Cash L2 = new Leaf2();
        Cash L1 = new Leaf1();

        L500.setNext(L200);
        L200.setNext(L100);
        L100.setNext(L50);
        L50.setNext(L20);
        L20.setNext(L10);
        L10.setNext(L5);
        L5.setNext(L2);
        L2.setNext(L1);

        L500.getCash(10_757);
    }
}
