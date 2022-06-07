package com.github.passmesomesugar.straightforward_pattern_tests.search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import com.github.passmesomesugar.services.StringService;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class SearchResultNegativeTest extends CommonTestConditions {
    @Test(groups = "smoke1", description = "one can not retrieve search results")
    public void searchAndRetrieveNegative() {
        String searchQuery = StringService.getRandomString(9);
        open(MAIN_URL);
        element(Selectors.byCssSelector("input[name='searchTerm']")).setValue(searchQuery).pressEnter();
        element(Selectors.byCssSelector("#collection")).shouldHave(Condition.text(" No Items Found "));
        open(BLANK_PAGE);
    }
}
