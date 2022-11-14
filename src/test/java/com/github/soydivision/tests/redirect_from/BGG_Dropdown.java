package com.github.soydivision.tests.redirect_from;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class BGG_Dropdown extends CommonTestConditions {

    @Test(groups = {"sanity", "all"}, description = "")
    public void redirectToRPG() {
        getIndexPage().openPage();
        getIndexPage().clickBGGDropDown();
        getIndexPage().clickOnByText("RPGGeek");
        webdriver().shouldHave(urlContaining("rpggeek"));
    }

    @Test(groups = {"sanity", "all"}, description = "")
    public void redirectToVGG() {
        getIndexPage().openPage();
        getIndexPage().clickBGGDropDown();
        getIndexPage().clickOnByText("VideoGameGeek");
        webdriver().shouldHave(urlContaining("videogamegeek"));
    }
}
