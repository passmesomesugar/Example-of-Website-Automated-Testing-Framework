package com.github.passmesomesugar.smoke;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class SignInTest extends BasicTestConditions {
    @Test(groups = "this")
    public void openHomeAndSignIn() {
        open(BASEURL);
        element(Selectors.byText("Sign In")).click();
        /*
         * Please used valid username and password to run this test.
         * */
        element(Selectors.byCssSelector("input[name='username']")).setValue("~");
        element(Selectors.byCssSelector("input[name='password']")).setValue("~");
        element(Selectors.byXpath("//button[text()=' Sign In ']")).click();
        Selenide.sleep(5000);
    }
}
