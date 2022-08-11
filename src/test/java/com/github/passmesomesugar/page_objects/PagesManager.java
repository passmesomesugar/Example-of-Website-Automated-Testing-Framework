package com.github.passmesomesugar.page_objects;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class PagesManager {
//    private Index indexPage;
//
//    private Profile profilePage;
//
//    private Gallery gallery;

    public Index getIndexPage() {
        return new Index();
    }

    public Gallery getGalleryPage() {
        return new Gallery();
    }


//    public Profile getProfilePage() {
//        return profilePage;
//    }

    @BeforeClass(alwaysRun = true)
    public void setUpPages() {
//        indexPage = new Index();
//        gallery = new Gallery();
    }

    @AfterClass(alwaysRun = true)
    public void afterClassActions() {
        WebDriverRunner.closeWebDriver(); // or clear cookies?
    }


}
