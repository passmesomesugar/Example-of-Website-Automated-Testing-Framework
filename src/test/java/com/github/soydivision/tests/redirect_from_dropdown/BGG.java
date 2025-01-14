package com.github.soydivision.tests.redirect_from_dropdown;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class BGG extends CommonTestConditions {

    @Test(groups = {"sanity", "all"}, description = "")
    public void redirectToRPG() {
        getIndexPage().openPage();
        getIndexPage().clickBGGDropDown();
        getIndexPage().clickByText("RPGGeek");
        webdriver().shouldHave(urlContaining("rpggeek"));
    }

    @Test(groups = {"sanity", "all"}, description = "")
    public void redirectToVGG() {
        getIndexPage().openPage();
        getIndexPage().clickBGGDropDown();
        getIndexPage().clickByText("VideoGameGeek");
        webdriver().shouldHave(urlContaining("videogamegeek"));
    }
}
