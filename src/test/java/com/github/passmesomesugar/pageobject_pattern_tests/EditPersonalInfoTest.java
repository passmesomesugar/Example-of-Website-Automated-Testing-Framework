package com.github.passmesomesugar.pageobject_pattern_tests;

import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

public class EditPersonalInfoTest extends CommonTestConditions {

    @Test(groups = "smoke", description = "user can return search results")
    public void searchResultsTest() {
        getIndexPage().openPage();
        getIndexPage().openProfile();
        getProfilePage().editUserDetails();
        getProfilePage().editUserDetails();


    }
}