package com.template.behavioral.iterator;

public class IntArray implements Container {

    private final int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < arr.length;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                return arr[index++];
            }

            return null;
        }

    }

}
