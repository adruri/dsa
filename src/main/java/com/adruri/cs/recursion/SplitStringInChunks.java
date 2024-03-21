package com.adruri.cs.recursion;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SplitStringInChunks {

    private static final int BYTE_CHUNK = (1024 * 3) + 512;

    private static final int CHUNK = 10;

    private static final String LONG_STRING = "asdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasdasdfasasdfa ofaisjf oasidjfoa isdjfoaisdjf oasifjao fijasd";
    private static final String SHORT_STRING = "123456789009876543211";
    private static final String TEN = "1234567890";
    private static final String NINE = "123456789";
    private static final String ELEVEN = "12345678901";

    public static void main(String[] args) {

        List<String> result = new ArrayList<>();
        split(SHORT_STRING, result, 0);

        log.info("Result: {}", result);
        log.info("Result size: {}", result.size());
    }

    static void split(String longString, List<String> result, int substringIndex) {
        if (substringIndex > longString.length()) {
            return;
        }

        if (substringIndex + CHUNK >= longString.length()) {
            result.add(longString.substring(substringIndex));
            return;
        }

        result.add(longString.substring(substringIndex, substringIndex + CHUNK));
        split(longString, result, substringIndex + CHUNK);
    }
}
