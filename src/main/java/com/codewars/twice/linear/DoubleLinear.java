package com.codewars.twice.linear;

import java.util.Set;
import java.util.TreeSet;

class DoubleLinear {
    public static int dblLinear(int n) {
        TreeSet<Integer> u = new TreeSet<>(Set.of(1));

        for (int i = 0; i < n; i++) {
            int x = u.pollFirst();
            u.add(2 * x + 1); // add y
            u.add(3 * x + 1); // add z
        }

        return u.pollFirst();
    }
}