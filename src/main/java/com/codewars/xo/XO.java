package com.codewars.xo;

public class XO {
    private static final String X = "X";
    private static final String O = "O";

    public static boolean getXO(String str) {
        int counter = 0;

        for (String letter : str.split("")) {
            if (letter.equalsIgnoreCase(X)) counter++;
            else if (letter.equalsIgnoreCase(O)) counter--;
        }

        return counter == 0;
    }
}