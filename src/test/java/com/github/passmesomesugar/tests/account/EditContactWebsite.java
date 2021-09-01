package com.github.passmesomesugar.tests.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import com.github.passmesomesugar.services.StringService;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class EditContactWebsite extends CommonTestConditions {
    String website = StringService.getRandomString(8);

    @Test(groups = "smoke", description = "one can edit contact details: website")
    public void editContactDetailsWebsite() {
        logIn();
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Account")).click();
        element(Selectors.byLinkText("Edit Contact Details")).click();
        element(Selectors.byCssSelector("input[id='website']")).setValue("www." + website + ".com");
        element(Selectors.byCssSelector("input[id='password']")).setValue(userPassword);
        element(Selectors.byCssSelector("input[type='submit']")).click();
        open(MAINURL);
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Profile")).click();

        /*Assertions*/
        element(Selectors.byCssSelector("div.profile_block:nth-child(4) > table:nth-child(2) > tbody:nth-child(1) > " +
                "tr:nth-child(7) > td:nth-child(2)")).shouldHave(Condition.text("www." + website + ".com"));
        logOut();
    }
}
