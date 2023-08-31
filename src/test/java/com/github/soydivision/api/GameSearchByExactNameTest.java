package com.github.soydivision.api;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GameSearchByExactNameTest extends APIBaseTest {

    String GAME = "Go";
    String YEARPUBLISHED = "-2200";

    @Test(groups = "api")
    void gameSearchByExactNameTest() {
        //RestAssured.baseURI = BASE_URI;
        given().accept(ContentType.XML)
                .when().get("/search?search=go&exact=1")
                .then().assertThat()
                .body("boardgames.boardgame.name", Matchers.equalTo(GAME))
                .and().assertThat()
                .body("boardgames.boardgame.yearpublished",
                        Matchers.equalTo(YEARPUBLISHED));
    }
}
