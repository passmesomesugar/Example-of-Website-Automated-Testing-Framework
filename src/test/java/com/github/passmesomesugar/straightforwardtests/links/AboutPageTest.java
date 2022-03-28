package com.github.passmesomesugar.straightforwardtests.links;

import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;
import static com.github.passmesomesugar.services.Scrolla.scrollUntilElementExists;

public class AboutPageTest extends CommonTestConditions {
    String pageTitle = "Welcome to BoardGameGeek | Wiki  | BoardGameGeek";

    @Test(groups = "smoke", description = "one can access about page")
    public void aboutPageTest() {
        open(MAIN_URL);
        scrollUntilElementExists(element(Selectors.byXpath("//a[text()='About']")));
        element(Selectors.byXpath("//a[text()='About']")).click();
        element("title").shouldHave(attribute("text", pageTitle));
        open(BLANK_PAGE);
    }
}
