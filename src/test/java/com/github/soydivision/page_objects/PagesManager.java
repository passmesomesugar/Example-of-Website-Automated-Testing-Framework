package com.github.soydivision.page_objects;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class PagesManager {
    private Index indexPage;
    private Profile profilePage;
    private Gallery gallery;

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
    }

    @AfterClass(alwaysRun = true)
    public void afterClassActions() {
        WebDriverRunner.closeWebDriver(); // or clear cookies?
    }
}
