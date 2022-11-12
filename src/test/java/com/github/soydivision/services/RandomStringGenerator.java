package com.github.soydivision.services;

import java.util.Random;

public class RandomStringGenerator {
    private static RandomStringGenerator randomStringGenerator = null;

    private RandomStringGenerator() {
    }

    public static RandomStringGenerator RandomStringGenerator() {
        if (randomStringGenerator == null) {
            randomStringGenerator = new RandomStringGenerator();
        }
        return randomStringGenerator;
    }

    public String generateRandomString(int length) {
        int leftLimit = 97; // ~ 'a'
        int rightLimit = 122; // ~ 'z'
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
}
