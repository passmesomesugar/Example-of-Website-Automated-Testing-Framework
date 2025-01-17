package com.github.soydivision.tests.url;

import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import com.github.soydivision.services.LinksParser;
import com.github.soydivision.services.PropertyDataReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;
import static com.github.soydivision.services.LinksParser.checkLinks;
import static com.github.soydivision.services.Scrolla.scrollUntilElementExists;

public class MainPageLinksTest extends CommonTestConditions {
    //Needs more refactor, on pause
    @Test(groups = "advanced", description = "parse all links on main page and check them")
    public void mainPageLinksTest() {
        open(MAIN_URL);
        ArrayList<String> excludedLinks = new ArrayList<String>(Arrays.asList(PropertyDataReader.getProperties("currentEnv").getProperty(
                "excluded.websites.to.check").split(" ")));
        scrollUntilElementExists(element(Selectors.byXpath("//a[text()='About']")));
        List links = LinksParser.getAllLinksOnPage();
        System.out.println("*******************************SIZE OF LINKS*******************************");
        System.out.println(links.size());
        ArrayList<String> cleanLinks = LinksParser.removeExcludedLinks((ArrayList<String>) links, excludedLinks);
        System.out.println("*******************************SIZE OF CLEAN LINKS*******************************");
        System.out.println(cleanLinks.size());
        ArrayList<String> brokenLinks = checkLinks(cleanLinks);
        System.out.println("*******************************Broken links:*******************************");
        System.out.println(brokenLinks.size());
        System.out.println(brokenLinks);
        Assert.assertTrue(brokenLinks.isEmpty());
    }
}