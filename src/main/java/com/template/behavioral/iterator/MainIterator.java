package com.template.behavioral.iterator;

public class MainIterator {

    public static void main(String[] args) {
        IntArray arr = new IntArray();
        Iterator iter = arr.getIterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
