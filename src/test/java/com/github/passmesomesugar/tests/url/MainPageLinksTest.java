package com.github.passmesomesugar.tests.url;

import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import com.github.passmesomesugar.services.LinksParser;
import com.github.passmesomesugar.services.PropertyDataReader;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;
import static com.github.passmesomesugar.services.LinksParser.checkLinks;
import static com.github.passmesomesugar.services.Scrolla.scrollUntilElementExists;

public class MainPageLinksTest extends CommonTestConditions {

    @Test(groups = "smoke", description = "checking urls on main page")
    public void mainPageLinksTest() {
        open(MAIN_URL);
        ArrayList<String> excludedLinks = new ArrayList<String>(Arrays.asList(PropertyDataReader.getProperties("currentEnv").getProperty(
                "excluded.websites.to.check").split(" ")));
        scrollUntilElementExists(element(Selectors.byXpath("//a[text()='About']")));
        List links = LinksParser.getAllLinksOnPage();
        System.out.println("*******************************SIZE OF LINKS*******************************");
        System.out.println(links.size());
        //  links.forEach(System.out::println);
        //  links = LinksParser.removeExcludedLinks((ArrayList<String>) links, excludedLinks);
        ArrayList<String> cleanLinks = LinksParser.removeExcludedLinks((ArrayList<String>) links, excludedLinks);
        System.out.println("*******************************SIZE OF CLEAN LINKS*******************************");
        System.out.println(cleanLinks.size());
        //        links.forEach(System.out::println);
        ArrayList<String> brokenLinks = checkLinks(cleanLinks);
        System.out.println("*******************************Broken links:*******************************");
        System.out.println(brokenLinks.size());
        System.out.println(brokenLinks);
    }
}