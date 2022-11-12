package com.github.soydivision.tests.profile;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class EditUserProfileDescription extends CommonTestConditions {

    //@Test(groups = {"sanity", "all"}, priority = 0)
    public void addUserProfileDescription() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openProfilePage();
        getProfilePage().editUserProfile();
        getProfilePage().sendText("Description sample text");
        getProfilePage().submit();
        getProfilePage().checkSuccessfulUpdateMessage();
        element(Selectors.byText("Description sample text")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"}, priority = 1)
//    @Test(groups = "this", priority = 0)
    public void removeUserProfileDescription() {
        getProfilePage().editUserProfile();
        getProfilePage().sendText();
        getProfilePage().submit();
        getProfilePage().checkSuccessfulUpdateMessage();
        element(Selectors.byText("Description sample text")).shouldNot(Condition.exist);
    }
}