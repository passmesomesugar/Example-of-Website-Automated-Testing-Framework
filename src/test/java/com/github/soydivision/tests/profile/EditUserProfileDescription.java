package com.github.soydivision.tests.profile;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.github.soydivision.services.RandomStringGenerator.RandomStringGenerator;

public class EditUserProfileDescription extends CommonTestConditions {
    String description = RandomStringGenerator().generateRandomString(15);

    @Test(groups = {"advanced", "all"}, priority = 0)
    public void addUserProfileDescription() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openProfilePage();
        getProfilePage().editUserProfile();
        getProfilePage().sendText(description);
        getProfilePage().submit();
        getProfilePage().checkSuccessfulUpdateMessage();
        element(Selectors.byText(description)).should(Condition.exist);
    }

    @Test(groups = {"advanced", "all"}, priority = 1)
    public void removeUserProfileDescription() {
        getProfilePage().editUserProfile();
        getProfilePage().sendText();
        getProfilePage().submit();
        getProfilePage().checkSuccessfulUpdateMessage();
        element(Selectors.byText(description)).shouldNot(Condition.exist);
    }
}