package com.template.behavioral.chain;

public class Leaf10 extends Cash {
    @Override
    public void getCash(int sum) {
        if (sum - MoneyLeaf.ten >= 0) {
            int n = sum / MoneyLeaf.ten;
            sum -= n * MoneyLeaf.ten;
            printLeaf(MoneyLeaf.ten, n);
        }
        if (sum > 0 && next != null) {
            next.getCash(sum);
        }
    }
}
