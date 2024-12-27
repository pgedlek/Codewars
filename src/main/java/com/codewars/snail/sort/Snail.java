package com.codewars.snail.sort;

import java.util.ArrayList;
import java.util.List;

public class Snail {
    public static int[] snail(int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return new int[0];
        }

        int size = array.length;
        int top = 0, bottom = size - 1;
        int left = 0, right = size - 1;

        List<Integer> r = new ArrayList<>();

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) { // Direction -> RIGHT
                r.add(array[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) { // Direction -> DOWN
                r.add(array[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) { // Direction -> LEFT
                    r.add(array[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) { // Direction -> UP
                    r.add(array[i][left]);
                }
                left++;
            }
        }

        return r.stream().mapToInt(Integer::intValue).toArray();
    }
}