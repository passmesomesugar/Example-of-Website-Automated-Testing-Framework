package com.github.soydivision.straightforward_pattern_tests.login;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class SignInTest extends CommonTestConditions {
    @Test(groups = "smoke1", description = "one can sign-in using valid credentials")
    public void openHomeAndSignIn() {
//        open(MAIN_URL);
//        element(Selectors.byText("Sign In")).click();
//        element(Selectors.byCssSelector("input[name='username']")).setValue(userLogin);
//        element(Selectors.byCssSelector("input[name='password']")).setValue(userPassword);
//        element(Selectors.byXpath("//button[text()=' Sign In ']")).click();
//        element(Selectors.byText("Sign In")).shouldNotHave(Condition.exist);
//        logOut();
    }
}
