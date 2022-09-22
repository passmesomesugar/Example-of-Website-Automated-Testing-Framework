package com.github.soydivision.tests.redirect_from_dropdown;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class BGG extends CommonTestConditions {

    @Test(groups = "this", description = "Redirection from main page to another page")
    public void redirectToRPG() {
        getIndexPage().openPage();
        getIndexPage().clickBGGDropDown();
        getIndexPage().clickOnByText("RPGGeek");
        webdriver().shouldHave(urlContaining("rpggeek"));
    }

    @Test(groups = "this", description = "Redirection from main page to another page")
    public void redirectToVGG() {
        getIndexPage().openPage();
        getIndexPage().clickBGGDropDown();
        getIndexPage().clickOnByText("VideoGameGeek");
        webdriver().shouldHave(urlContaining("videogamegeek"));
    }
}
