package com.github.passmesomesugar.tests.links;

import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import com.github.passmesomesugar.services.Scrolla;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.github.passmesomesugar.services.Scrolla.scrollUntilElementIsVisible;

public class AdvertisingPageTest extends CommonTestConditions {
    String pageTitle = "Welcome to BoardGameGeek | Wiki  | BoardGameGeek";

    @Test(groups = "this", description = "one can access about page")
    public void advertisingPageTest() {
        open(MAINURL);
//        element(Selectors.byXpath("//a[text()='About']")).click();
        //getWebDriver().
        scrollUntilElementIsVisible(element(Selectors.byXpath("//a[text()='About']")));
        // executeJavaScript("window.scrollTo(0,document.body.scrollHeight);");
//        element(Selectors.byXpath("//a[text()='About']")).click();
        //element(Selectors.byLinkText("About")).click();
        //element("title").shouldHave(attribute("text", pageTitle));
        element(Selectors.byXpath("//a[text()='About']")).click();
        sleep(5000);
    }
}
