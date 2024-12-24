package com.codewars.valid.braces;

import java.util.Set;
import java.util.Stack;

public class BraceChecker {
    private static final int OPENING_PARENTHESIS = '(';
    private static final int CLOSING_PARENTHESIS = ')';
    private static final int OPENING_CURLY_BRACKET = '{';
    private static final int CLOSING_CURLY_BRACKET = '}';
    private static final int OPENING_SQUARE_BRACKET = '[';
    private static final int CLOSING_SQUARE_BRACKET = ']';

    public boolean isValid(String braces) {
        if (braces == null || braces.isEmpty()) {
            return true;
        }

        Set<Integer> openingBracketsSet = Set.of(OPENING_PARENTHESIS, OPENING_CURLY_BRACKET, OPENING_SQUARE_BRACKET);
        Stack<Integer> stack = new Stack<>();

        for (int brace : braces.toCharArray()) {
            if (openingBracketsSet.contains(brace)) {
                stack.push(brace);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                int top = stack.pop();
                if ((top != OPENING_PARENTHESIS && brace == CLOSING_PARENTHESIS) ||
                   (top != OPENING_CURLY_BRACKET && brace == CLOSING_CURLY_BRACKET) ||
                   (top != OPENING_SQUARE_BRACKET && brace == CLOSING_SQUARE_BRACKET)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}