package com.codewars.camelcase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void tests() {
        assertEquals("camel Casing", Solution.camelCase("camelCasing"), "Incorrect");
        assertEquals("camel Casing Test", Solution.camelCase("camelCasingTest"), "Incorrect");
        assertEquals("camelcasingtest", Solution.camelCase("camelcasingtest"), "Incorrect");
    }
}
