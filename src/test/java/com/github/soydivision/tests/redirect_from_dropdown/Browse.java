package com.github.soydivision.tests.redirect_from_dropdown;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Browse extends CommonTestConditions {

    int MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE = 2;

    @Test(groups = {"this", "all"}, priority = -1)
    public void accessIndexPage() {
        getIndexPage().openPage();
    }

    @Test(groups = {"this", "all"})
    public void browseAllBoardgames() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("All Boardgames");
        element(Selectors.byAttribute("class", "collection_table")).should(Condition.exist);
    }

    @Test(groups = {"this", "all"})
    public void browseCategories() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Categories");
        element(Selectors.byText("Board Game Categories")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//div[@id='maincontent']//tr"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browseArtists() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Artists");
        element(Selectors.byText("Board Game Artists")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//div[@id='maincontent']//tr"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browsePublishers() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Publishers");
        element(Selectors.byText("Board Game Publishers")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//div[@id='maincontent']//tr"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browseHonors() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Honors");
        element(Selectors.byText("Board Game Honors")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//div[@id='maincontent']//tr"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browseGoneCardboard() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Gone Cardboard");
        element(Selectors.byText("Gone Cardboard listings")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//div[@id='maincontent']//tr//tbody//tr"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browseRecentAdditions() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Recent Additions");
        element(Selectors.byText("Recent Additions")).should(Condition.exist);
        element(Selectors.byAttribute("class", "forum_table")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//div[@id='maincontent']//table[@class='forum_table']//tr"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browsePreviews() {
        getIndexPage().openPage();
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Previews");
        element(Selectors.byText("Previews")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//li[contains(@class, 'preview-item')]"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browseFamilies() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Families");
        element(Selectors.byText("Families")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//div[@id='maincontent']//table//tr//td"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browseMechanics() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Mechanics");
        element(Selectors.byText("Mechanics")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//div[@id='maincontent']//table//tr//td"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browseDesigners() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Designers");
        element(Selectors.byText("Board Game Designers")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//div[@id='maincontent']//table//tr//td"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browseAccessories() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Accessories");
        element(Selectors.byText("Accessory Rank")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//div[@id='maincontent']//table//tr"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browseRandomGame() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Random Game");
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
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Accessories");
        element(Selectors.byText("Accessories")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//div[@id='maincontent']//table//tr//td"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }

    @Test(groups = {"this", "all"})
    public void browseWiki() {
        getIndexPage().clickButtonByName("Browse");
        getIndexPage().clickByText("Wiki");
        element(Selectors.byText("Index")).should(Condition.exist);
        element(Selectors.byAttribute("id", "maincontent")).should(Condition.exist);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//td//li"));
        Assert.assertTrue(elementsCollection.size() > MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE);
    }
}
