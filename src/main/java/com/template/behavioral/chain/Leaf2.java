package com.template.behavioral.chain;

public class Leaf2 extends Cash {
    @Override
    public void getCash(int sum) {
        if (sum - MoneyLeaf.two >= 0) {
            int n = sum / MoneyLeaf.two;
            sum -= n * MoneyLeaf.two;
            printLeaf(MoneyLeaf.two, n);
        }
        if (sum > 0 && next != null) {
            next.getCash(sum);
        }
    }
}
