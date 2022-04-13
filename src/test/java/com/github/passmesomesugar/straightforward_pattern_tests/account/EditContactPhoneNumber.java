package com.github.passmesomesugar.straightforward_pattern_tests.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import com.github.passmesomesugar.services.StringService;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class EditContactPhoneNumber extends CommonTestConditions {
    String phoneNumber = StringService.getRandomPhoneNumberString(11);

    @Test(groups = "smoke", description = "one can change phone number")
    public void editContactDetailsPhoneNumber() {
        logIn();
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Account")).click();
        element(Selectors.byLinkText("Edit Contact Details")).click();
        element(Selectors.byCssSelector("input[id='phone']")).setValue(phoneNumber);
        element(Selectors.byCssSelector("input[id='password']")).setValue(userPassword);
        element(Selectors.byCssSelector("input[type='submit']")).click();

        open(MAIN_URL);
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Account")).click();
        element(Selectors.byLinkText("Edit Contact Details")).click();
        element(Selectors.byCssSelector("input[id='phone']")).shouldHave(Condition.attribute("value", phoneNumber));
        open(BLANK_PAGE);
        logOut();
    }
}
