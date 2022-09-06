package com.github.soydivision.tests.search_results;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import com.github.soydivision.services.StringService;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class SearchResultNegative extends CommonTestConditions {

    @Test(groups = "sanity", description = "user can not return search results for random string")
    public void searchResultsTest() {
        String searchQuery = StringService.getRandomString(9);
        getIndexPage().openPage();
        getIndexPage().search(searchQuery);
        element(Selectors.byCssSelector("#collection")).shouldHave(Condition.text(" No Items Found "));
    }
}
