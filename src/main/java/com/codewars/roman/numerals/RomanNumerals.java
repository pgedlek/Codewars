package com.codewars.roman.numerals;

import java.util.List;
import java.util.Map;

public class RomanNumerals {
    // toRoman
    private static final List<String> individuals = List.of("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX");
    private static final List<String> dozens = List.of("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC");
    private static final List<String> hundreds = List.of("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM");
    private static final List<String> thousands = List.of("", "M", "MM", "MMM");
    // fromRoman
    private static final Map<Character, Integer> romanMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public static String toRoman(int n) {
        return thousands.get((n / 1000) % 10) +
                hundreds.get((n / 100) % 10) +
                dozens.get((n / 10) % 10) +
                individuals.get(n % 10);
    }

    public static int fromRoman(String romanNumeral) {
        int sum = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            if (i + 1 < romanNumeral.length() &&
                    (romanMap.get(romanNumeral.charAt(i)) < romanMap.get(romanNumeral.charAt(i + 1)))) {
                sum += romanMap.get(romanNumeral.charAt(i + 1)) - romanMap.get(romanNumeral.charAt(i));
                i++;
            } else {
                sum += romanMap.get(romanNumeral.charAt(i));
            }
        }
        return sum;
    }
}