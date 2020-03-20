package com.template.behavioral.chain;

public class Leaf100 extends Cash {
    @Override
    public void getCash(int sum) {
        if (sum - MoneyLeaf.oneHundred >= 0) {
            int n = sum / MoneyLeaf.oneHundred;
            sum -= n * MoneyLeaf.oneHundred;
            printLeaf(MoneyLeaf.oneHundred, n);
        }
        if (sum > 0 && next != null) {
            next.getCash(sum);
        }
    }
}
