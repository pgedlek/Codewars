package com.codewars.not.very.secure;

import java.util.regex.Pattern;

public class SecureTester {
    public static boolean alphanumeric(String s) {
        return Pattern.matches("[a-zA-Z0-9]+", s);
    }
}