package com.codewars.range.extraction;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String rangeExtraction(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        List<String> rangeList = new ArrayList<>();
        int previous = arr[0];
        List<Integer> range = new ArrayList<>(List.of(previous));
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            if (previous + 1 != current) {
                addToRangeList(rangeList, range);
                range = new ArrayList<>();
            }
            previous = current;
            range.add(current);
        }
        addToRangeList(rangeList, range);
        return String.join(",", rangeList);
    }

    private static void addToRangeList(List<String> rangeList, List<Integer> range) {
        if (range.size() > 2) {
            rangeList.add(String.format("%d-%d", range.get(0), range.get(range.size() - 1)));
        } else {
            range.forEach(number -> rangeList.add(String.valueOf(number)));
        }
    }
}
