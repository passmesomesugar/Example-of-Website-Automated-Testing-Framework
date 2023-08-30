package com.github.soydivision.page_objects;

import org.testng.annotations.BeforeClass;

public class PagesManager {
    private Index indexPage;
    private Profile profilePage;
    private Gallery gallery;
    private TempMailOrg tempMailOrg;
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

    public TempMailOrg getTempMailOrg() {
        return tempMailOrg;
    }

    @BeforeClass(alwaysRun = true)
    public void setUpPages() {
        indexPage = new Index();
        gallery = new Gallery();
        profilePage = new Profile();
        tempMailOrg = new TempMailOrg();
    }
}
