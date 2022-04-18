package com.github.passmesomesugar.straightforward_pattern_tests.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import com.github.passmesomesugar.services.StringService;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class EditContactCity extends CommonTestConditions {
    String city = StringService.getRandomString(8);

    @Test(groups = "smoke", description = "one can edit contact details: city")
    public void editContactDetailsCity() {
//        logIn();
//        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
//        element(Selectors.byLinkText("Account")).click();
//        element(Selectors.byLinkText("Edit Contact Details")).click();
//        element(Selectors.byCssSelector("input[id='city']")).setValue(city);
//        element(Selectors.byCssSelector("input[id='password']")).setValue(userPassword);
//        element(Selectors.byCssSelector("input[type='submit']")).click();
//        element(Selectors.byCssSelector("div.profile_block:nth-child(4) > table:nth-child(2)")).shouldHave(Condition.text(city));
//        open(BLANK_PAGE);
//        logOut();
    }
}
