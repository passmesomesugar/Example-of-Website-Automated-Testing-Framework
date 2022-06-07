package com.github.passmesomesugar.pageobject_pattern_tests;

import com.codeborne.selenide.Selenide;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class RPGGeekSiteRedirect extends CommonTestConditions {

    @Test(groups = "1", description = "redirection from main page to another page")
    public void redirect() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        Selenide.sleep(5000);
        getIndexPage().clickBGGDropDown();
        Selenide.sleep(5000);
        getIndexPage().clickOn("RPGGeek");
        Selenide.sleep(5000);
        webdriver().shouldHave(urlContaining("rpggeek"));
        Selenide.sleep(10000);
    }
}
