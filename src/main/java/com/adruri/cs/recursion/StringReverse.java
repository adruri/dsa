package com.adruri.cs.recursion;

public class StringReverse {
    /**
     * Reverses a String recursively
     *
     * "12345"
     *
     * "15432"
     * "54321"
     *
     * @param string
     * @return
     */
    public String reverse(String string) {

        if (string.length() == 1) {
            return string;
        }


        return reverse(string.substring(1)) + string.charAt(0);
    }

}
