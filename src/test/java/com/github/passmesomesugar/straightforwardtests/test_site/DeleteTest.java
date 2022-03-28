package com.github.passmesomesugar.straightforwardtests.test_site;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.Selenide.*;

public class DeleteTest extends CommonTestConditions {
    private static final Logger logger = LogManager.getLogger(DeleteTest.class);

    @Test(groups = "1", description = "test site")
    public void someMethodToTestSomething() {
        String searchQuery = "Dune";
        open(MAIN_URL);
        element(Selectors.byCssSelector("input[name='searchTerm']")).setValue(searchQuery).pressEnter();
        element(Selectors.byCssSelector("#collection")).shouldNotHave(Condition.text(" No Items Found "));
        open(BLANK_PAGE);
    }
}