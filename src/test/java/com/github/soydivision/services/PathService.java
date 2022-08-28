package com.github.soydivision.services;

public class PathService {
    private PathService() {
    }

    public static String getAbsolutePath(String relativePath) {
        String systemPath = System.getProperty("user.dir");
        return systemPath.concat("\\").concat(relativePath);
    }
}
