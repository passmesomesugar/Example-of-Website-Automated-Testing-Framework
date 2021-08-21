package com.github.passmesomesugar.login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class SignOutTest extends CommonTestConditions {
    @Test(groups = "this")
    public void signInAndSignOut() {
        Selenide.open(BASEURL);
        element(Selectors.byText("Sign In")).click();
        element(Selectors.byCssSelector("input[name='username']")).setValue(userLogin);
        element(Selectors.byCssSelector("input[name='password']")).setValue(userPassword);
        element(Selectors.byXpath("//button[text()=' Sign In ']")).click();
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Sign Out")).click();
        element(Selectors.byText("Sign In")).shouldHave(Condition.exist);
    }
}
