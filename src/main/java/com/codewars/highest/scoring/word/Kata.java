package com.codewars.highest.scoring.word;

public class Kata {
    public static String high(String s) {
        String result = "";
        int currentHighScore = 0;
        for (String word : s.split(" ")) {
            int score = score(word);
            if (score > currentHighScore) {
                currentHighScore = score;
                result = word;
            }
        }
        return result;
    }

    private static int score(String word) {
        int sum = 0;
        for (char c : word.toCharArray()) {
            sum += (c - 96);
        }
        return sum;
    }
}