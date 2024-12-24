package com.codewars.phone.number;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        if (numbers.length != 10) {
            return "";
        }
        
        String firstStringOfDigits = "" + numbers[0] + numbers[1] + numbers[2];
        String secondStringOfDigits = "" + numbers[3] + numbers[4] + numbers[5];
        String thirdStringOfDigits = "" + numbers[6] + numbers[7] + numbers[8] + numbers[9];

        return String.format("(%s) %s-%s", firstStringOfDigits, secondStringOfDigits, thirdStringOfDigits);
    }
}
