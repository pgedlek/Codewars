package com.codewars.which.are.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> substringList = new ArrayList<>();
        for (String substring : array1) {
            if (Arrays.stream(array2).anyMatch(word -> word.contains(substring))) {
                substringList.add(substring);
            }
        }
        return substringList.stream().sorted().toList().toArray(new String[0]);
    }
}
