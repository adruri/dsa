package com.adruri.cs;

public class StrongPassword {

    private static final String NUMBERS = "0123456789";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-+";
    private static final int MIN_LENGTH = 6;
    private static final int NUM_OF_CONSTRAINTS = 5;

    public int check(String password) {

        boolean numbers = false;
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean specialChar = false;
        boolean minLength = password.length() >= MIN_LENGTH;

        for (int i = 0; i < password.length(); i++) {
            if (NUMBERS.indexOf(password.charAt(i)) >= 0) {
                numbers = true;
            }

            if (LOWER_CASE.indexOf(password.charAt(i)) >= 0) {
                lowerCase = true;
            }

            if (UPPER_CASE.indexOf(password.charAt(i)) >= 0) {
                upperCase = true;
            }

            if (SPECIAL_CHARACTERS.indexOf(password.charAt(i)) >= 0) {
                specialChar = true;
            }
        }

        int result = NUM_OF_CONSTRAINTS;

        if (numbers) {
            result--;
        }

        if (lowerCase) {
            result--;
        }

        if (upperCase) {
            result--;
        }

        if (specialChar) {
            result--;
        }

        if (minLength) {
            result--;
        }

        return result;
    }
}
