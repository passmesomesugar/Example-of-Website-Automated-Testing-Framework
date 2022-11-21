package com.github.soydivision.page_objects;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class PagesManager {
    private Index indexPage;
    private Profile profilePage;
    private Gallery gallery;
    public final String BLANK_PAGE =
            System.getProperty("user.dir").concat("\\").concat("\\src\\test\\resources\\blankpage.html");

    public Index getIndexPage() {
        return indexPage;
    }

    public Gallery getGalleryPage() {
        return gallery;
    }

    public Profile getProfilePage() {
        return profilePage;
    }

    @BeforeClass(alwaysRun = true)
    public void setUpPages() {
        indexPage = new Index();
        gallery = new Gallery();
        profilePage = new Profile();
    }

    @AfterClass(alwaysRun = true)
    public void refreshBrowser() {
        clearBrowserCookies();
        open(BLANK_PAGE);
    }
}
