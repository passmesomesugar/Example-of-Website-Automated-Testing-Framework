package com.github.soydivision.api;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class APIBaseTest {
    String BASE_URI = "https://boardgamegeek.com/xmlapi";

    @BeforeTest
    void setBASE_URI() {
        RestAssured.baseURI = BASE_URI;
    }
}
