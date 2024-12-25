package com.codewars.missing.letter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void exampleTests() {
        assertEquals('e', Kata.findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
        assertEquals('P', Kata.findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
    }
}