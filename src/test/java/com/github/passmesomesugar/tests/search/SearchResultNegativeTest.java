package com.github.passmesomesugar.tests.search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import com.github.passmesomesugar.services.StringService;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class SearchResultNegativeTest extends CommonTestConditions {
    @Test(groups = "this", description = "one can not retrieve search results")
    public void searchAndRetrieve() {
        String searchQuery = StringService.getRandomString(9);
        open(BASEURL);
        element(Selectors.byCssSelector("input[name='searchTerm']")).setValue(searchQuery).pressEnter();
        element("#collection").shouldHave(Condition.text(" No Items Found "));
        open(BLANKPAGE);
    }
}
