package com.github.passmesomesugar.smoke;

import com.codeborne.selenide.Selectors;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class SignInTest extends BasicTestConditions {
    @Test(groups = "this")
    public void openHomeAndSignIn() {
        open(BASEURL);
        element(Selectors.byText("Sign In")).click();
        element(Selectors.byCssSelector("input[name='username']")).setValue("Valid User Name");
        element(Selectors.byCssSelector("input[name='password']")).setValue("Valid User Pass");
    }
}
