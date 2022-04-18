package com.github.passmesomesugar.pageobject_pattern_tests;

import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class SignInTest extends CommonTestConditions {
    @Test(groups = "this", description = "one can sign-in and sign-out")
    public void signInAndSignOut() {
        getIndexPage().openPage();
        getIndexPage().logIn();
//        element(Selectors.byText("Sign In")).click();
//        element(Selectors.byCssSelector("input[name='username']")).setValue(userLogin);
//        element(Selectors.byCssSelector("input[name='password']")).setValue(userPassword);
//        element(Selectors.byXpath("//button[text()=' Sign In ']")).click();
//        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
//        element(Selectors.byLinkText("Sign Out")).click();
//        element(Selectors.byText("Sign In")).shouldHave(Condition.exist);
//        open(BLANK_PAGE);
    }
}
