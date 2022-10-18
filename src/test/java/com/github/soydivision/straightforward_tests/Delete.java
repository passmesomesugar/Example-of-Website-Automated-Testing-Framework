package com.github.soydivision.straightforward_tests;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.commands.Commands;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class Delete extends CommonTestConditions {

    @Test
    public void test() {
        element(Selectors.byCssSelector("div.profile_block:nth-child(4) > table:nth-child(2)")).pressEnter();
        Commands.getInstance().add("myPressEnter", new MyPressEnter());
    }
}
