package com.github.passmesomesugar.pageobject_pattern_tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class SignInTest extends CommonTestConditions {
    @Test(groups = "this", description = "one can sign-in and sign-out")
    public void signInAndSignOut() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        element(Selectors.byText(userLogin)).should(Condition.exist);
        getIndexPage().logOut();
        element(Selectors.byText(userLogin)).shouldNot(Condition.exist);
    }
}
