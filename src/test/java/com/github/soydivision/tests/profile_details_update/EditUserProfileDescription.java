package com.github.soydivision.tests.profile_details_update;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

public class EditUserProfileDescription extends CommonTestConditions {

    @Test(groups = "this", priority = 0)
    public void searchResultsTest() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openProfilePage();
        getProfilePage().edit();
        getProfilePage().sendDescription("Description sample text");
        getProfilePage().submit();
        getProfilePage().checkUpdateSuccessMessage();
    }
}