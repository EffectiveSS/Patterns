package com.template.behavioral.chain;

public class Leaf20 extends Cash {
    @Override
    public void getCash(int sum) {
        if (sum - MoneyLeaf.twenty >= 0) {
            int n = sum / MoneyLeaf.twenty;
            sum -= n * MoneyLeaf.twenty;
            printLeaf(MoneyLeaf.twenty, n);
        }
        if (sum > 0 && next != null) {
            next.getCash(sum);
        }
    }
}
