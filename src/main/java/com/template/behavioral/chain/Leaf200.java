package com.template.behavioral.chain;

public class Leaf200 extends Cash {
    @Override
    public void getCash(int sum) {
        if (sum - MoneyLeaf.twoHundred >= 0) {
            int n = sum / MoneyLeaf.twoHundred;
            sum -= n * MoneyLeaf.twoHundred;
            printLeaf(MoneyLeaf.twoHundred, n);
        }
        if (sum > 0 && next != null) {
            next.getCash(sum);
        }
    }
}
