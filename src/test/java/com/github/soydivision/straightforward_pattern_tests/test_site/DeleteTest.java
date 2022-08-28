package com.github.soydivision.straightforward_pattern_tests.test_site;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class DeleteTest extends CommonTestConditions {
    // private static final Logger logger = LogManager.getLogger(DeleteTest.class);

    @Test(groups = "1", description = "test site")
    public void someMethodToTestSomething() {
        String searchQuery = "Dune";
        open(MAIN_URL);
        element(Selectors.byCssSelector("input[name='searchTerm']")).setValue(searchQuery).pressEnter();
        element(Selectors.byCssSelector("#collection")).shouldNotHave(Condition.text(" No Items Found "));
        open(BLANK_PAGE);
    }
}