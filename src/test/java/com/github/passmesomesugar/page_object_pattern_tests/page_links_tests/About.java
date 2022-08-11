package com.github.passmesomesugar.page_object_pattern_tests.page_links_tests;

import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.element;

public class About extends CommonTestConditions {
    String pageTitle = "Welcome to BoardGameGeek | Wiki  | BoardGameGeek";

    @Test(groups = "smoke", description = "Accessing about page")
    public void signInAndSignOut() {
        getIndexPage().openPage();
        getIndexPage().clickAbout();
        element("title").shouldHave(attribute("text", pageTitle));
    }
}
