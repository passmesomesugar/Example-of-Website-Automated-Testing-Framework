package com.github.soydivision;

import com.codeborne.selenide.Configuration;
import com.github.soydivision.page_objects.PagesManager;
import com.github.soydivision.services.PropertyDataReader;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class CommonTestConditions extends PagesManager {
    public final String MAIN_URL = "https://boardgamegeek.com";
    public final String propFile = "env";
    public final String mockData = "mock-data";
    public final String userLogin = PropertyDataReader.getProperties(propFile).getProperty("user.login.name");
    public final String userPassword = PropertyDataReader.getProperties(propFile).getProperty("user.password");
    public int MINIMAL_NUMBER_OF_ELEMENTS_IN_TABLE = 2;
    public int IMAGE_UPLOAD_TIMEOUT = 2000;


    @BeforeSuite(alwaysRun = true)
    void beforeSuiteSetUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 30000;
    }

    @AfterClass(alwaysRun = true)
    public void clearBrowser() {
        clearBrowserCookies();
        open(BLANK_PAGE);
    }
}
