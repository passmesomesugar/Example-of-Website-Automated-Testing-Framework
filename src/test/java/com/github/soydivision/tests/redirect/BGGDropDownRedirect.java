package com.github.soydivision.tests.redirect;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class BGGDropDownRedirect extends CommonTestConditions {

    @Test(groups = "this", description = "Redirection from main page to another page")
    public void redirectToRPG() {
        getIndexPage().openPage();
        //getIndexPage().logIn();
        getIndexPage().clickBGGDropDown();
        getIndexPage().clickOn("RPGGeek");
        webdriver().shouldHave(urlContaining("rpggeek"));
    }

    @Test(groups = "this", description = "Redirection from main page to another page")
    public void redirectToVGG() {
        getIndexPage().openPage();
        //getIndexPage().logIn();
        getIndexPage().clickBGGDropDown();
        getIndexPage().clickOn("VideoGameGeek");
        webdriver().shouldHave(urlContaining("videogamegeek"));
    }
}
