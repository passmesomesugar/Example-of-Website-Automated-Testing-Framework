package com.github.passmesomesugar.pageobjects;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.github.passmesomesugar.CommonTestConditions;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class IndexPage extends CommonTestConditions {

    private SelenideElement signInButton = element(Selectors.byText("Sign In"));
//    element(Selectors.byCssSelector("input[name='username']")).setValue(userLogin);
//    element(Selectors.byCssSelector("input[name='password']")).setValue(userPassword);
//    element(Selectors.byXpath("//button[text()=' Sign In ']")).click();

    public void openPage() {
        open(MAIN_URL);
    }

    public void logIn() {
        signInButton.click();
        //element(Selectors.byCssSelector("input[name='username']")).shouldHave(Condition.exist, Duration.ofSeconds(10));
        element(Selectors.byCssSelector("input[name='username']")).setValue(userLogin);
        element(Selectors.byCssSelector("input[name='password']")).setValue(userPassword);
        element(Selectors.byXpath("//button[text()=' Sign In ']")).click();
    }

    public void logOut() {
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Sign Out")).click();
    }

}
