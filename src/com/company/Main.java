package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(5);
        intList.add(16);
        intList.add(-1);
        intList.add(-2);
        intList.add(0);
        intList.add(32);
        intList.add(3);
        intList.add(5);
        intList.add(8);
        intList.add(23);
        intList.add(4);

        Iterator<Integer> intIterator = intList.iterator();
        while (intIterator.hasNext()) {
            Integer iter = intIterator.next();
            if (iter < 1 || iter % 2 != 0) {
                intIterator.remove();
            }
        }

        Collections.sort(intList);
        for (Integer list : intList) {
            System.out.println(list);
        }
    }
}
