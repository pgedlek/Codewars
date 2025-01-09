package com.codewars.crack.md5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Should_pass_all_of_these {
    private CodeWars objTF = new CodeWars();

    @Test
    public void simple_test() {
        assertEquals("12345", objTF.crack("827ccb0eea8a706c4c34a16891f84e7b"), "Should work with simple PIN");
    }

    @Test
    public void harder_test() {
        assertEquals("00078", objTF.crack("86aa400b65433b608a9db30070ec60cd"), "Should work with harder PIN");
    }
}