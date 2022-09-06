package com.github.soydivision.tests.redirect;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class BrowseDropDownRedirect extends CommonTestConditions {
    @Test(groups = "this", description = "")
    public void redirect() {
        getIndexPage().openPage();
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOn("All Boardgames");
        element(Selectors.byAttribute("class", "collection_table")).should(Condition.exist);
    }
}
