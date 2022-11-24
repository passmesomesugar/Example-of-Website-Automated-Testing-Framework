package com.github.soydivision.tests.redirect_from_dropdown;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

public class Forums extends CommonTestConditions {

    @Test(groups = {"1", "all"}, priority = -1)
    public void allForums() {
        getIndexPage().openPage();
        getIndexPage().clickButtonByName("Forums");
        getIndexPage().clickByText("All Forums");
        Selenide.element(Selectors.byText("Forums")).should(Condition.exist);
        Selenide.sleep(5000);
    }


    @Test(groups = {"1", "all"})
    public void forumsRecent() {
        getIndexPage().clickButtonByName("Forums");
        getIndexPage().clickByText("Recent");
        Selenide.element(Selectors.byText("Forums")).should(Condition.exist);
        Selenide.sleep(5000);
    }

    @Test(groups = {"1", "all"})
    public void forumsSearch() {
        getIndexPage().clickButtonByName("Forums");
        getIndexPage().clickByText("Search");
        Selenide.element(Selectors.byText("Forums")).should(Condition.exist);
        Selenide.sleep(5000);
    }

//


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
