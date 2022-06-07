package com.github.passmesomesugar.pageobject_pattern_tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class SearchResult extends CommonTestConditions {

    @Test(groups = "this", description = "user can return search results")
    public void searchResultsTest() {
        String searchQuery = "Dune";
        getIndexPage().openPage();
        getIndexPage().search(searchQuery);
        element(Selectors.byCssSelector("#collection")).shouldNotHave(Condition.text(" No Items Found "));
    }
}
