package com.github.soydivision.services;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public final class PropertyDataReader {
    private static Properties properties;

    private PropertyDataReader() {
    }

    public static Properties getProperties(final String propertiesFileName) {
        try {
            FileReader fileReader =
                    new FileReader("src/test/resources/" + propertiesFileName + ".properties");
            properties = new Properties();
            properties.load(fileReader);
        } catch (IOException e) {
            System.out.println();
        }
        return properties;
    }
}
