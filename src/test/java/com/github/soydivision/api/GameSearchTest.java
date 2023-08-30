package com.github.soydivision.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GameSearchTest {

    @Test
    void gameSearchViaApi() {
        RestAssured.baseURI = "https://api.geekdo.com/xmlapi";
        given().accept(ContentType.XML)
                .when().get("/search?search=frika")
                .then().assertThat()
                .body("boardgames.boardgame.name", Matchers.equalTo("Fische Fluppen Frikadellen"))
                .and().assertThat()
                .body("boardgames.boardgame.yearpublished",
                        Matchers.equalTo("2002"));
    }
}
