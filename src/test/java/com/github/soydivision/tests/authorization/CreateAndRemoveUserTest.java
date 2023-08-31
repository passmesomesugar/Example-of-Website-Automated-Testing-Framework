package com.github.soydivision.tests.authorization;

import com.codeborne.selenide.Selenide;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;


public class CreateAndRemoveUserTest extends CommonTestConditions {
    @Test(groups = "this", description = "")
    public void registerAndRemoveNewUser() {
        getTempMailPage().openPage();
        getTempMailPage().copyEmailToClipboard();
        getIndexPage().openSignUpPage();


        Selenide.sleep(10000);
    }
}
