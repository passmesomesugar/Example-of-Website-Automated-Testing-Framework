package com.github.soydivision.tests.profile_details_update;

import com.codeborne.selenide.Selenide;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class EditUserProfile extends CommonTestConditions {

    @Test(groups = "this")
    public void searchResultsTest() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openProfile();
        getProfilePage().clickEdit();
        Selenide.sleep(5000);
        //getProfilePage().editUserDetails();
        //getProfilePage().editUserDetails();
        //element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }
}