package com.template.behavioral.chain.atm;

public abstract class Cash {

    private Cash next;
    private final int leaf;

    protected Cash(int leaf) {
        this.leaf = leaf;
    }

    public Cash getNext() {
        return next;
    }

    public void setNext(Cash next) {
        this.next = next;
    }

    public void getCash(int cash) {
        if (cash - leaf >= 0) {
            int n = cash / leaf;
            cash -= n * leaf;
            printLeaf(leaf, n);
        }

        if (cash > 0 && next != null) {
            next.getCash(cash);
        }
    }

    private void printLeaf(int leaf, int n) {
        System.out.println(leaf + ":\t" + n);
    }

}