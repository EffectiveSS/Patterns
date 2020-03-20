package com.template.behavioral.chain;

public class Leaf50 extends Cash {
    @Override
    public void getCash(int sum) {
        if (sum - MoneyLeaf.fifty >= 0) {
            int n = sum / MoneyLeaf.fifty;
            sum -= n * MoneyLeaf.fifty;
            printLeaf(MoneyLeaf.fifty, n);
        }
        if (sum > 0 && next != null) {
            next.getCash(sum);
        }
    }
}
