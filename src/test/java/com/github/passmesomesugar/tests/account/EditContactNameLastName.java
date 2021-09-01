package com.github.passmesomesugar.tests.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import com.github.passmesomesugar.services.StringService;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class EditContactNameLastName extends CommonTestConditions {
    String firstName = StringService.getRandomString(9);
    String lastName = StringService.getRandomString(9);

    @Test(groups = "smoke", description = "one can edit contact details: first and last name")
    public void editContactDetailsNameLastName() {
        logIn();
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Account")).click();
        element(Selectors.byLinkText("Edit Contact Details")).click();
        element(Selectors.byCssSelector("input[id='firstname']")).setValue(firstName);
        element(Selectors.byCssSelector("input[id='lastname']")).setValue(lastName);
        element(Selectors.byCssSelector("input[id='password']")).setValue(userPassword);
        element(Selectors.byCssSelector("input[type='submit']")).click();
        open(MAINURL);
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Profile")).click();
        /*Assertions*/
        element(Selectors.byCssSelector("div[data-username=" + userLogin + "]")).shouldHave(Condition.text(firstName + " " + lastName));
        logOut();
        sleep(5000);
    }
}
