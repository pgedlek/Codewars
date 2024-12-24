package com.codewars.persistent.bugger;

class Persist {
    public static int persistence(long n) {
        int multiplication = 0;
        while (n / 10 > 0) {
            multiplication++;
            long tmp = n;
            long newN = 1;
            while (tmp > 0) {
                newN *= tmp % 10;
                tmp /= 10;
            }
            n = newN;
        }

        return multiplication;
    }
}
