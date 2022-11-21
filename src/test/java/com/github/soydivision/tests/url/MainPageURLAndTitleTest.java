package com.github.soydivision.tests.url;

import com.github.soydivision.CommonTestConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverConditions.urlStartingWith;

public class MainPageURLAndTitleTest extends CommonTestConditions {
    @Test(groups = {"sanity", "all"}, description = "checking AUT url for errors")
    public void openMainPageAndCheckURL() {
        open(MAIN_URL);
        webdriver().shouldHave(url("https://boardgamegeek.com/"));
        webdriver().shouldNotHave(url("http://example.com"));
        webdriver().shouldNotHave(urlStartingWith("http://"));
        webdriver().shouldNotHave(urlStartingWith("ftp://"));
        Assert.assertTrue(title().contains("Gaming"));
        Assert.assertEquals(title(), "BoardGameGeek | Gaming Unplugged Since 2000");
    }
}
