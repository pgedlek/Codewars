package com.codewars.crack.md5;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CodeWars {
    public String crack(String hash) {
        for (int i = 0; i <= 99999; i++) {
            String input = prepareInput(i);
            String secret = md5(input);
            if (hash.equals(secret)) {
                return input;
            }
        }
        throw new IllegalArgumentException("Invalid hash provided: " + hash);
    }

    private String prepareInput(int number) {
        if (number < 10) return "0000" + number;
        else if (number < 100) return "000" + number;
        else if (number < 1000) return "00" + number;
        else if (number < 10000) return "0" + number;
        else return String.valueOf(number);
    }

    private String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes(StandardCharsets.UTF_8));
            BigInteger no = new BigInteger(1, messageDigest);
            return no.toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
