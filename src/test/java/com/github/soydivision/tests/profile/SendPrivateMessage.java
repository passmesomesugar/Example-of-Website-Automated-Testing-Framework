package com.github.soydivision.tests.profile;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.github.soydivision.services.RandomStringGenerator.RandomStringGenerator;

public class SendPrivateMessage extends CommonTestConditions {
    String mailSubject = RandomStringGenerator().generateRandomString(3);
    String mailText = RandomStringGenerator().generateRandomString(25);

    @Test(groups = "all")
    public void sendGeekMailToOneSelf() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openProfilePage();
        getProfilePage().sendPrivateMessage();
        getProfilePage().setSubject(mailSubject);
        getProfilePage().sendText(mailText);
        getProfilePage().sendMessage();
        getIndexPage().clickOnMail();
        element(Selectors.byText(mailSubject)).should(Condition.exist);
        element(Selectors.byText(mailSubject)).click();
        element(Selectors.byText(mailText)).should(Condition.exist);
        element(Selectors.byText("Delete")).click();
        element(Selectors.byText("No Messages")).should(Condition.exist);
    }
}
