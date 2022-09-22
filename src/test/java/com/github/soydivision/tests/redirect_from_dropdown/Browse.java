package com.github.soydivision.tests.redirect_from_dropdown;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class Browse extends CommonTestConditions {
    @Test(groups = "this", description = "")
    public void redirect_All_Boardgames() {
        getIndexPage().openPage();
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("All Boardgames");
        element(Selectors.byAttribute("class", "collection_table")).should(Condition.exist);
    }

    @Test(groups = "this", description = "")
    public void redirect_Categories() {
        getIndexPage().openPage();
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Categories");
        // Set assertion
    }

    @Test(groups = "this", description = "")
    public void redirect_Artists() {
        getIndexPage().openPage();
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("");
        // Set assertion
    }


//            Artists
//    Publishers
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
