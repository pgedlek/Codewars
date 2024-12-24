package com.codewars.array.diff;

import java.util.List;
import java.util.stream.IntStream;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        if (a == null || a.length == 0) {
            return new int[0];
        }
        if (b == null || b.length == 0) {
            return a;
        }

        return findArrayDiff(a, b);
    }

    private static int[] findArrayDiff(int[] a, int[] b) {
        List<Integer> bToList = IntStream.of(b).boxed().toList();
        return IntStream.of(a).filter(numberFromA -> !bToList.contains(numberFromA)).toArray();
    }
}
