package com.github.soydivision.tests.search_results;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

public class InForums extends CommonTestConditions {

    @Test(groups = {"1", "all"})
    public void forumSearchByKeywords() {
        getIndexPage().clickButtonByName("Forums");
        getIndexPage().clickByText("Search");


    }

    @Test(groups = {"1", "all"})
    public void forumSearchByUsername() {
        getIndexPage().clickButtonByName("Forums");
        getIndexPage().clickByText("");
        getIndexPage().clickByText("Search");

    }


}

// from dropdown
// by user name
// by game name