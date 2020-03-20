package com.template.behavioral.chain;

public class Leaf500 extends Cash {
    @Override
    public void getCash(int sum) {
        if (sum - MoneyLeaf.fiveHundred >= 0) {
            int n = sum / MoneyLeaf.fiveHundred;
            sum -= n * MoneyLeaf.fiveHundred;
            printLeaf(MoneyLeaf.fiveHundred, n);
        }
        if (sum > 0 && next != null) {
            next.getCash(sum);
        }
    }
}
