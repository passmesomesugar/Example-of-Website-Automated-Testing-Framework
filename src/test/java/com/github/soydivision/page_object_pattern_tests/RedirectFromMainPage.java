package com.github.soydivision.page_object_pattern_tests;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class RedirectFromMainPage extends CommonTestConditions {

    @Test(groups = "sanity", description = "Redirection from main page to another page")
    public void redirectToRPG() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().clickBGGDropDown();
        getIndexPage().clickOn("RPGGeek");
        webdriver().shouldHave(urlContaining("rpggeek"));
    }

    @Test(groups = "sanity", description = "Redirection from main page to another page")
    public void redirectToVGG() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().clickBGGDropDown();
        getIndexPage().clickOn("VideoGameGeek");
        webdriver().shouldHave(urlContaining("videogamegeek"));
    }
}
