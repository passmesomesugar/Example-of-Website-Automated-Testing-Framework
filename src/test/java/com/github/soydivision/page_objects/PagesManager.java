package com.github.soydivision.page_objects;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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
    public void afterClassActions() {
        Selenide.clearBrowserCookies();
        Selenide.open(BLANK_PAGE);
    }
}
