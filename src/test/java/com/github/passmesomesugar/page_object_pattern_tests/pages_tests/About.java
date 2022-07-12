package com.github.passmesomesugar.page_object_pattern_tests.pages_tests;

import com.codeborne.selenide.Selectors;
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
        element(Selectors.byXpath("//a[text()='About']")).click();
        element("title").shouldHave(attribute("text", pageTitle));
    }
}
