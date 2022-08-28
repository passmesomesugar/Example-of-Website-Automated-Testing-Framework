package com.github.soydivision.services;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class LinksParser {
    private LinksParser() {
    }

    private static final int INVALID_RESPONSE_CODE = 400;

    public static ArrayList<String> getAllLinksOnPage() {
        List<WebElement> links = getWebDriver().findElements(By.tagName("a"));
        List<String> linksArrayList = new ArrayList<>();
        for (WebElement link : links) {
            if (link.getAttribute("href") != null || link.getAttribute("href") != "") {
//                System.out.println("`" + link.getAttribute("href") + "`");
                linksArrayList.add(link.getAttribute("href"));
            }
        }
        linksArrayList.removeAll(Collections.singleton(null));
        return (ArrayList<String>) linksArrayList;
    }


    public static boolean isValidLink(String url) {
        url = url.replaceAll("\\s+", "");
        if (url != null) {
            boolean isValidLink = false;
            if ((!isValidLinkCheckingWithRequestMethod(url, "HEAD"))
                    && (!isValidLinkCheckingWithRequestMethod(url, "GET"))) {
                isValidLink = isLinkValidCheckInATab(url);
            } else {
                isValidLink = true;
                //LOGGER.info("link: " + url + " is valid");
                System.out.println(url + " is valid");
            }
            return isValidLink;
        } else {
            return false;
        }
    }

    public static boolean isValidLinkCheckingWithRequestMethod(final String url, final String requestMethod) {
        boolean isValidLink = false;
        HttpURLConnection httpURLConnection = null;
        int responseCode = 0;
        if (url == null || url.isEmpty()) {
            return isValidLink;
        } else {
            try {
                httpURLConnection = (HttpURLConnection) (new URL(url).openConnection());
                httpURLConnection.setRequestMethod(requestMethod);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= INVALID_RESPONSE_CODE) {
                    isValidLink = false;
                } else {
                    isValidLink = true;
                }
            } catch (IOException exception) {
                exception.printStackTrace();
                //LOGGER.error("isValidLinkCheckingWithRequestMethod failed due to IOException" + exception.getMessage());
            }
        }
        httpURLConnection = null;
        return isValidLink;
    }

    public static boolean isLinkValidCheckInATab(final String url) {
        Selenide.open(url);
        boolean pageLoaded = false;
        if (WebDriverRunner.url().contains(url)) {
            pageLoaded = true;
        }
        return pageLoaded;
    }

    public static ArrayList<String> removeExcludedLinks(final ArrayList<String> linksOnPage,
                                                        final ArrayList<String> excludedLinks) {
        System.out.println("Removing excluded links from list of all links");
        System.out.println(excludedLinks);

        List<String> cleanList = new ArrayList<>();
        if (excludedLinks.isEmpty()) {
            cleanList = linksOnPage;

        } else {
            for (String linkOnPage : linksOnPage) {
                int exclusionCounter = 0;
                for (int i = 0; i < excludedLinks.size(); i++) {
                    if (linkOnPage.contains(excludedLinks.get(i))) {
                        exclusionCounter++;
                        System.out.println("checking if " + linkOnPage + " contains " + excludedLinks.get(i) + " ,result check is: " + linkOnPage.contains(excludedLinks.get(i)));
                        System.out.println("Exclusion counter: " + exclusionCounter);
                    }
                }
                if (exclusionCounter == 0) {
                    cleanList.add(linkOnPage);
                    System.out.println("Adding " + linkOnPage + " to cleanList");
                }
            }
        }
        return (ArrayList<String>) cleanList;
    }

    public static ArrayList<String> checkLinks(final List<String> links) {
        List<String> brokenLinks = new ArrayList<>();
        for (String link : links) {
            if (!isValidLink(link)) {
                brokenLinks.add(link);
            } else {
                //System.out.println("Valid link: " + link);
            }
        }
        if (!brokenLinks.isEmpty()) {
            //LOGGER.info("Broken links are:" + brokenLinks);
        }
        return (ArrayList<String>) brokenLinks;
    }
}
