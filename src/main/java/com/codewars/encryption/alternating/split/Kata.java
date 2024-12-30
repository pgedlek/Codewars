package com.codewars.encryption.alternating.split;

public class Kata {
    public static String encrypt(final String text, final int n) {
        if (text == null || text.isEmpty() || n <= 0) {
            return text;
        }

        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < n; i++) {
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();

            for (int j = 0; j < text.length(); j++) {
                if (j % 2 == 0) {
                    even.append(sb.charAt(j));
                } else {
                    odd.append(sb.charAt(j));
                }
            }
            sb = new StringBuilder(odd + even.toString());
        }
        return sb.toString();
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null || encryptedText.isEmpty() || n <= 0) {
            return encryptedText;
        }

        StringBuilder sb = new StringBuilder(encryptedText);
        for (int i = 0; i < n; i++) {
            int mid = sb.length() / 2;
            String even = sb.substring(mid);
            String odd = sb.substring(0, mid);

            String[] result = new String[even.length() + odd.length()];
            for (int j = 0; j < even.length(); j++) {
                result[2 * j] = String.valueOf(even.charAt(j));
            }
            for (int j = 0; j < odd.length(); j++) {
                result[2 * j + 1] = String.valueOf(odd.charAt(j));
            }
            sb = new StringBuilder(String.join("", result));
        }

        return sb.toString();
    }
}
