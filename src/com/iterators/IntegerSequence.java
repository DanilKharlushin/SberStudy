package com.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerSequence implements Iterable<Integer> {

    private Integer[] sequence;

    public IntegerSequence(Integer[] sequence) {
        this.sequence = sequence;
    }

    public Integer[] getSequence() {
        return sequence;
    }

    public void setSequence(Integer[] sequence) {
        this.sequence = sequence;
    }

    @Override
    public Iterator iterator() {
        return new IntegerSequenceIterator(sequence);
    }

    public class IntegerSequenceIterator implements Iterator<Integer> {

        private int arrayPosition = 0;
        private ArrayList<Integer> numList;

        public IntegerSequenceIterator(Integer[] sequence) {
            this.numList = new ArrayList<>();
            for (Integer n : sequence) {
                while (n >= 1) {
                    numList.add(n % 10);
                    n = n / 10;
                }
            }
        }


        @Override
        public boolean hasNext() {
            return arrayPosition < numList.size();
        }

        @Override
        public Integer next() {
            return numList.get(arrayPosition++);
        }
    }
}
