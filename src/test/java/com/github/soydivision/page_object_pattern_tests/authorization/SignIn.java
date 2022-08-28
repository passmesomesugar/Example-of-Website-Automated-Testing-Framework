package com.github.soydivision.page_object_pattern_tests.authorization;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class SignIn extends CommonTestConditions {
    @Test(groups = "sanity", description = "one can sign-in and sign-out test")
    public void signInAndSignOut() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        element(Selectors.byText(userLogin)).should(Condition.exist);
        getIndexPage().logOut();
        element(Selectors.byText(userLogin)).shouldNot(Condition.exist);
    }
}