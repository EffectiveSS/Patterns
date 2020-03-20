package com.template.behavioral.chain;

public class Leaf5 extends Cash {
    @Override
    public void getCash(int sum) {
        if (sum - MoneyLeaf.five >= 0) {
            int n = sum / MoneyLeaf.five;
            sum -= n * MoneyLeaf.five;
            printLeaf(MoneyLeaf.five, n);
        }
        if (sum > 0 && next != null) {
            next.getCash(sum);
        }
    }
}
