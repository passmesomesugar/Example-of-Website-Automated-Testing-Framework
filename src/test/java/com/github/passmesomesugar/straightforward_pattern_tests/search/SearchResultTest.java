package com.github.passmesomesugar.straightforward_pattern_tests.search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class SearchResultTest extends CommonTestConditions {
    @Test(groups = "smoke1", description = "one can retrieve search results")
    public void searchAndRetrieve() {
        String searchQuery = "Dune";
        open(MAIN_URL);
        element(Selectors.byCssSelector("input[name='searchTerm']")).setValue(searchQuery).pressEnter();
        element(Selectors.byCssSelector("#collection")).shouldNotHave(Condition.text(" No Items Found "));
        open(BLANK_PAGE);
    }
}
