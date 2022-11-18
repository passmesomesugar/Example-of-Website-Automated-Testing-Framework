package com.github.soydivision.tests.redirect_from_dropdown;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class Browse extends CommonTestConditions {

    @Test(groups = {"this", "all"}, priority = -1)
    public void accessIndexPage() {
        getIndexPage().openPage();
    }

    @Test(groups = {"this", "all"})
    public void browseAllBoardgames() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("All Boardgames");
        element(Selectors.byAttribute("class", "collection_table")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseCategories() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Categories");
        element(Selectors.byText("Board Game Categories")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseArtists() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Artists");
        element(Selectors.byText("Board Game Artists")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browsePublishers() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Publishers");
        element(Selectors.byText("Board Game Publishers")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseHonors() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Honors");
        element(Selectors.byText("Board Game Honors")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseGoneCardboard() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Gone Cardboard");
        element(Selectors.byText("Gone Cardboard listings")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseRecentAdditions() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Recent Additions");
        element(Selectors.byText("Recent Additions")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browsePreviews() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Recent Additions");
        element(Selectors.byText("Recent Additions")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseFamilies() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Families");
        element(Selectors.byText("Families")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseMechanics() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Mechanics");
        element(Selectors.byText("Mechanics")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseDesigners() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Designers");
        element(Selectors.byText("Board Game Designers")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseAccessories() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Accessories");
        element(Selectors.byText("Accessory Rank")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseRandomGame() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Random Game");
        element(Selectors.byText("Overview")).should(Condition.exist);
        element(Selectors.byText("Description")).should(Condition.exist);
        element(Selectors.byText("Ratings")).should(Condition.exist);
        element(Selectors.byText("Forums")).should(Condition.exist);
        element(Selectors.byText("Images")).should(Condition.exist);
        element(Selectors.byText("Videos")).should(Condition.exist);
        element(Selectors.byText("Files")).should(Condition.exist);
        element(Selectors.byText("Stats")).should(Condition.exist);
        element(Selectors.byText("Versions")).should(Condition.exist);
        element(Selectors.byText("Expansions")).should(Condition.exist);
        element(Selectors.byText("My Games")).should(Condition.exist);
        element(Selectors.byText("Shopping")).should(Condition.exist);
        element(Selectors.byText("More")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browsePodcasts() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Accessories");
        element(Selectors.byText("Accessories")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseWiki() {
        getIndexPage().clickDropdownByName("Browse");
        getIndexPage().clickOnByText("Wiki");
        element(Selectors.byText("Index")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }
}
