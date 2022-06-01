package com.github.passmesomesugar.pageobject_pattern_tests;

import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

public class SearchResultTest extends CommonTestConditions {

    @Test(groups = "smoke", description = "user can return search results")
    public void searchResultsTest() {
        String searchQuery = "Dune";
        getIndexPage().openPage();
        getIndexPage().search(searchQuery);


    }
}
