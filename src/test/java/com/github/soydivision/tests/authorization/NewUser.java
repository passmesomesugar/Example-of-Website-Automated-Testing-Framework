package com.github.soydivision.tests.authorization;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

public class NewUser extends CommonTestConditions {
    @Test(groups = {"sanity", "all"}, description = "one can sign-in and sign-out test")
    public void registerNewUser() {
        getIndexPage().openPage();
    }

    //https://temp-mail.org/en/
    public void removeNewUser() {
    }
}
