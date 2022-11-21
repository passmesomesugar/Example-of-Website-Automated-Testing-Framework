package com.github.soydivision.tests.redirect_from_dropdown;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

public class Forums extends CommonTestConditions {

    @Test(groups = {"this", "all"})
    public void allForums() {
        getIndexPage().openPage();
        getIndexPage().clickDropdownByName("Forums");
        getIndexPage().clickOnByText("All Forums");
        Selenide.element(Selectors.byXpath("//h2[contains(., 'Forums')]")).should(Condition.exist);
    }


    //    All Forums
//    Recent
//            Search
//    Moderators
//            Subscriptions
//    Hot
//            Active
//    Post Thread
//    Bookmarks
//    Community Rules
}
