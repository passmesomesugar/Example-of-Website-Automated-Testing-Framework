package com.github.soydivision.tests.page_links_tests;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.element;

public class About extends CommonTestConditions {
    String PAGE_TITLE = "Welcome to BoardGameGeek | Wiki  | BoardGameGeek";

    @Test(groups = "sanity", description = "Accessing about page")
    public void signInAndSignOut() {
        getIndexPage().openPage();
        getIndexPage().clickAbout();
        element("title").shouldHave(attribute("text", PAGE_TITLE));
    }
}
