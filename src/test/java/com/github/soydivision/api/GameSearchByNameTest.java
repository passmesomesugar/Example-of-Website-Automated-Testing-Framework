package com.github.soydivision.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GameSearchByNameTest extends APIBaseTest {

    String GAME = "Fische Fluppen Frikadellen";
    String YEARPUBLISHED = "2002";

    @Test(groups = "api")
    void gameSearchByNameTest() {
       // RestAssured.baseURI = BASE_URI;
        given().accept(ContentType.XML)
                .when().get("/search?search=frika")
                .then().assertThat()
                .body("boardgames.boardgame.name", Matchers.equalTo(GAME))
                .and().assertThat()
                .body("boardgames.boardgame.yearpublished",
                        Matchers.equalTo(YEARPUBLISHED));
    }
}
