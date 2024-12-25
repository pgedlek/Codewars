package com.codewars.missing.letter;

public class Kata {
    public static char findMissingLetter(char[] array) {
        int previousCharacterAscii = array[0] - 1;
        char missingLetter = ' ';
        for (char character : array) {
            if (previousCharacterAscii + 1 != (int) character) {
                missingLetter = (char) (previousCharacterAscii + 1);
            }
            previousCharacterAscii = character;
        }
        return missingLetter;
    }
}
