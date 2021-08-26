package com.github.passmesomesugar.services;

import java.security.SecureRandom;

public class StringService {
    private static final String REGEXP = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();

    private StringService() {
    }

    public static String getRandomString(final int len) {
        StringBuilder builder = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            builder.append(REGEXP.charAt(RANDOM.nextInt(REGEXP.length())));
        }
        return builder.toString();
    }

    public static String getRandomPhoneNumberString(final int len) {
        StringBuilder builder = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            builder.append(NUMBERS.charAt(RANDOM.nextInt(NUMBERS.length())));
        }
        builder.insert(0, "+");
        return builder.toString();
    }
}
