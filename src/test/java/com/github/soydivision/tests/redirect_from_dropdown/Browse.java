package com.github.soydivision.tests.redirect_from_dropdown;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class Browse extends CommonTestConditions {
    @Test(groups = {"sanity", "all"})
    public void redirect_all_boardgames() {
        getIndexPage().openPage();
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("All Boardgames");
        element(Selectors.byAttribute("class", "collection_table")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void redirect_categories() {
        getIndexPage().openPage();
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Categories");
        element(Selectors.byXpath("//h3[text()='Board Game Categories']")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void redirect_artists() {
        getIndexPage().openPage();
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Artists");
        element(Selectors.byXpath("//h3[text()='Board Game Artists']")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void redirect_publishers() {
        getIndexPage().openPage();
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Publishers");
        element(Selectors.byXpath("//h3[text()='Board Game Publishers']")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

//            Honors
//    Gone Cardboard
//    Recent Additions
//    Previews
//            Families
//    Mechanics
//            Designers
//    Accessories
//    Random Game
//    Podcasts
//  Wiki
}
