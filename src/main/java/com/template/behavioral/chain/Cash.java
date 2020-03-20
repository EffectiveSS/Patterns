package com.template.behavioral.chain;

public abstract class Cash {
    protected Cash next;
    protected int leaf;

    public void setNext(Cash next) {
        this.next = next;
    }

    protected void printLeaf(int leaf, int n) {
        System.out.println(leaf + ":\t" + n);
    }

    public abstract void getCash(int sum);
}