package com.github.soydivision.tests.search_results;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class OnMainPage extends CommonTestConditions {

    @Test(groups = {"this", "all"}, description = "user can return search results")
    public void searchResultsTest() {
        String searchQuery = "Dune";
        getIndexPage().openPage();
        getIndexPage().search(searchQuery);
        element(Selectors.byCssSelector("#collection")).shouldNotHave(Condition.text(" No Items Found "));
    }
}
