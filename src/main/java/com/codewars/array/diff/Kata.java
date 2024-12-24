package com.codewars.array.diff;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        if (a == null || a.length == 0) {
            return new int[0];
        }
        if (b == null || b.length == 0) {
            return a;
        }

        return findArrayDiff(a, b).stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static List<Integer> findArrayDiff(int[] a, int[] b) {
        List<Integer> arrayDiffList = new ArrayList<>();

        for (int numberFromA : a) {
            boolean isPresent = false;
            for (int numberFromB : b) {
                if (numberFromA == numberFromB) {
                    isPresent = true;
                    break;
                }
            }

            if (!isPresent) {
                arrayDiffList.add(numberFromA);
            }
        }

        return arrayDiffList;
    }
}
