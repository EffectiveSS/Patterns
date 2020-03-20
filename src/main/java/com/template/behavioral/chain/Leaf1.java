package com.template.behavioral.chain;

public class Leaf1 extends Cash {
    @Override
    public void getCash(int sum) {
        if (sum - MoneyLeaf.one >= 0) {
            int n = sum / MoneyLeaf.one;
            sum -= n * MoneyLeaf.one;
            printLeaf(MoneyLeaf.one, n);
        }
        if (next != null) {
            next.getCash(sum);
        }
    }
}
