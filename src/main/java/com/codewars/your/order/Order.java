package com.codewars.your.order;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Order {
    private static final Pattern PATTERN = Pattern.compile("[1-9]");

    public static String order(String words) {
        String[] result = new String[10];

        for (String word : words.split(" ")) {
            Matcher matcher = PATTERN.matcher(word);
            int index = 10;
            if (matcher.find()) {
                index = Integer.parseInt(matcher.group());
            }

            result[index - 1] = word;
        }

        return Arrays.stream(result)
                .filter(Objects::nonNull)
                .collect(Collectors.joining(" "));
    }
}