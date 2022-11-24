package com.github.soydivision.tests.search_results;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.elements;

public class OnMainPage extends CommonTestConditions {

    @Test(groups = {"sanity", "all"}, description = "user can return search results")
    public void searchResultsTest() {
        String searchQuery = "Dune";
        getIndexPage().openPage();
        getIndexPage().search(searchQuery);
        element(Selectors.byCssSelector("#collection")).shouldNot(Condition.text(" No Items Found "));
        ElementsCollection elementsCollection = elements(Selectors.byAttribute("id", "row_"));
        Assert.assertTrue(elementsCollection.size() > 0);
    }
}
