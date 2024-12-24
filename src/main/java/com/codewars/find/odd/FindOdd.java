package com.codewars.find.odd;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> mapOfOccurrence = new HashMap<>();

        for (int number : a) {
            Integer occurrence = mapOfOccurrence.get(number);
            mapOfOccurrence.put(number, occurrence == null ? 1 : ++occurrence);
        }

        return mapOfOccurrence.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 == 1)
                .findFirst()
                .get()
                .getKey();
    }
}
