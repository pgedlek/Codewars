package com.codewars.string.casing;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(this::capitalize)
                .collect(Collectors.joining(" "));
    }

    private String capitalize(String s) {
        return !s.isEmpty()
                ? s.substring(0, 1).toUpperCase() + s.substring(1)
                : s;
    }
}
