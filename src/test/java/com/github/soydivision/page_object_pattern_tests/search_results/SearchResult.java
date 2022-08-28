package com.github.soydivision.page_object_pattern_tests.search_results;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class SearchResult extends CommonTestConditions {

    @Test(groups = "sanity", description = "user can return search results")
    public void searchResultsTest() {
        String searchQuery = "Dune";
        getIndexPage().openPage();
        getIndexPage().search(searchQuery);
        element(Selectors.byCssSelector("#collection")).shouldNotHave(Condition.text(" No Items Found "));
    }
}
