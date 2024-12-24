package com.codewars.rot13;

public class Kata {
    public static String rot13(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c > 64 && c < 91) {
                sb.append(rot13Character(c, 65));
            } else if (c > 96 && c < 123) {
                sb.append(rot13Character(c, 97));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static char rot13Character(int letterPos, int offset) {
        int letterPosRot13 = (letterPos - offset + 13) % 26;
        return (char) ((char) letterPosRot13 + offset);
    }
}