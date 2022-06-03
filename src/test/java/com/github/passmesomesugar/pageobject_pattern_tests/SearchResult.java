package com.github.passmesomesugar.pageobject_pattern_tests;

import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

public class SearchResult extends CommonTestConditions {

    @Test(groups = "1", description = "user can return search results")
    public void searchResultsTest() {
        String searchQuery = "Dune";
        getIndexPage().openPage();
        getIndexPage().search(searchQuery);


    }
}
