package com.github.passmesomesugar.pageobject_pattern_tests.search_results;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import com.github.passmesomesugar.services.StringService;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class SearchResultNegative extends CommonTestConditions {

    @Test(groups = "smoke", description = "user can return search results")
    public void searchResultsTest() {
        String searchQuery = StringService.getRandomString(9);
        getIndexPage().openPage();
        getIndexPage().search(searchQuery);
        element(Selectors.byCssSelector("#collection")).shouldHave(Condition.text(" No Items Found "));
    }
}
