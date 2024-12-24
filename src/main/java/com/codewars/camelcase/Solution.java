package com.codewars.camelcase;

class Solution {
    private static final String PATTERN = "(?=[A-Z])";

    public static String camelCase(String input) {
        return String.join(" ", input.split(PATTERN));
    }
}