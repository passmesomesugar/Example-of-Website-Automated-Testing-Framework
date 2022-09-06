package com.github.soydivision.tests;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

public class EditPersonalInfo extends CommonTestConditions {

    @Test(groups = "1", description = "user can return search results")
    public void searchResultsTest() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openProfile();
        //getProfilePage().editUserDetails();
        //getProfilePage().editUserDetails();


    }
}