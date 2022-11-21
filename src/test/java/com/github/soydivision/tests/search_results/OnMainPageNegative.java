package com.github.soydivision.tests.search_results;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import com.github.soydivision.services.StringService;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class OnMainPageNegative extends CommonTestConditions {

    @Test(groups = {"this", "all"}, description = "user can not return search results for random string")
    public void searchResultsTestNegative() {
        String searchQuery = StringService.getRandomString(9);
        getIndexPage().openPage();
        getIndexPage().search(searchQuery);
        element(Selectors.byCssSelector("#collection")).shouldHave(Condition.text(" No Items Found "));
    }
}
