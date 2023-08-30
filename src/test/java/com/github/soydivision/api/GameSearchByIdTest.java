package com.github.soydivision.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GameSearchByIdTest extends APIBaseTest{

    String GAME = "Undaunted: Stalingrad";
    String YEARPUBLISHED = "2022";
    String MIN_PLAYERS = "2";
    String MAX__PLAYERS = "2";

    @Test(groups = "api")
    void gameSearchByIdTest() {
      //  RestAssured.baseURI = BASE_URI;
        given().accept(ContentType.XML)
                .when().get("/boardgame/354570")
                .then().assertThat()

                .body("boardgames.boardgame.name[0]", Matchers.equalTo(GAME))

                .and().assertThat()
                .body("boardgames.boardgame.yearpublished", Matchers.equalTo(YEARPUBLISHED))

                .and().assertThat()
                .body("boardgames.boardgame.minplayers", Matchers.equalTo(MIN_PLAYERS))

                .and().assertThat()
                .body("boardgames.boardgame.maxplayers", Matchers.equalTo(MAX__PLAYERS))
        ;
    }
}
