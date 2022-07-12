package com.github.passmesomesugar.page_object_pattern_tests.links_to_pages_tests;

import com.codeborne.selenide.Selenide;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class Facebook extends CommonTestConditions {

    @Test(groups = "this", description = "Accessing Facebook page")
    public void signInAndSignOut() {
        getIndexPage().openPage();
        getIndexPage().clickFacebook();
        Selenide.webdriver().shouldHave(urlContaining("www.facebook.com"));
    }
}
