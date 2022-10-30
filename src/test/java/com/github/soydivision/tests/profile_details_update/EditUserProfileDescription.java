package com.github.soydivision.tests.profile_details_update;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class EditUserProfileDescription extends CommonTestConditions {

    @Test(groups = "this", priority = 0)
    public void addUserProfileDescription() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openProfilePage();
        getProfilePage().editUserProfile();
        getProfilePage().sendDescription("Description sample text");
        getProfilePage().submit();
        getProfilePage().checkSuccessfulUpdateMessage();
        element(Selectors.byText("Description sample text")).should(Condition.exist);
    }

    @Test(groups = "this", priority = 1)
    public void removeUserProfileDescription() {
        getProfilePage().editUserProfile();
        getProfilePage().sendDescription();
        getProfilePage().submit();
        getProfilePage().checkSuccessfulUpdateMessage();
    }
}