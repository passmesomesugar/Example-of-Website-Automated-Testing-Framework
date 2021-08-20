package com.github.passmesomesugar.smoke;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SignInTest extends BasicTestConditions {
    @Test(groups = "this")
    public void openHomeAndSignIn() {
        open(BASEURL);
        element(Selectors.byText("Sign In")).click();
        element(Selectors.byCssSelector("input[name='username']")).setValue(userLogin);
        element(Selectors.byCssSelector("input[name='password']")).setValue(userPassword);
        element(Selectors.byXpath("//button[text()=' Sign In ']")).click();
        element(Selectors.byText("Sign In")).shouldNotHave(Condition.exist);
        sleep(5000);
    }
}
