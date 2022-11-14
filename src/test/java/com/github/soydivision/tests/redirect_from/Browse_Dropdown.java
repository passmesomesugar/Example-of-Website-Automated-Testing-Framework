package com.github.soydivision.tests.redirect_from;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;

public class Browse_Dropdown extends CommonTestConditions {

    @Test(groups = {"sanity", "all"}, priority = -1)
    public void accessIndexPage() {
        getIndexPage().openPage();
    }

    @Test(groups = {"sanity", "all"})
    public void browseAllBoardgames() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("All Boardgames");
        element(Selectors.byAttribute("class", "collection_table")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browseCategories() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Categories");
        element(Selectors.byText("Board Game Categories")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browseArtists() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Artists");
        element(Selectors.byText("Board Game Artists")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browsePublishers() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Publishers");
        element(Selectors.byText("Board Game Publishers")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browseHonors() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Honors");
        element(Selectors.byText("Board Game Honors")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browseGoneCardboard() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Gone Cardboard");
        element(Selectors.byText("Gone Cardboard listings")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browseRecentAdditions() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Recent Additions");
        element(Selectors.byText("Recent Additions")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browsePreviews() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Recent Additions");
        element(Selectors.byText("Recent Additions")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browseFamilies() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Families");
        element(Selectors.byText("Families")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browseMechanics() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Mechanics");
        element(Selectors.byText("Mechanics")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browseDesigners() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Designers");
        element(Selectors.byText("Board Game Designers")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browseAccessories() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Accessories");
        element(Selectors.byText("Accessory Rank")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browseRandomGame() {
        getIndexPage().clickBrowseDropDown();
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

    @Test(groups = {"sanity", "all"})
    public void browsePodcasts() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Accessories");
        element(Selectors.byText("Accessories")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"})
    public void browseWiki() {
        getIndexPage().clickBrowseDropDown();
        getIndexPage().clickOnByText("Wiki");
        element(Selectors.byText("Index")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
    }
}
