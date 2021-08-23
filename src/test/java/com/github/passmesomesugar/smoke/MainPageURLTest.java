package com.github.passmesomesugar.smoke;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverConditions.urlStartingWith;

public class MainPageURLTest extends CommonTestConditions {
    @Test(groups = "smoke", description = "checking AUT url for errors")
    public void openMainPageAndCheckURL() {
        Configuration.timeout = URL_CHECKS_TIMEOUT;
        open(BASEURL);
        Selenide.webdriver().shouldHave(url("https://boardgamegeek.com/"));
        Selenide.webdriver().shouldNotHave(url("http://yandex.ru"));
        Selenide.webdriver().shouldNotHave(urlStartingWith("http://"));
        Selenide.webdriver().shouldNotHave(urlStartingWith("ftp://"));
        open(BLANKPAGE);
    }
}
