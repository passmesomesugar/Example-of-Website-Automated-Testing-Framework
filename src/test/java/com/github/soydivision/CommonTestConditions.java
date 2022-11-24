package com.github.soydivision;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.soydivision.page_objects.PagesManager;
import com.github.soydivision.services.PropertyDataReader;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import java.util.logging.Level;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class CommonTestConditions extends PagesManager {
    public final String MAIN_URL = "https://boardgamegeek.com";
    public final String currentEnv = System.getProperty("env");
    public final String mockData = System.getProperty("data");
    public final String userCredentials = System.getProperty("user-credentials");

    public final String userLogin = PropertyDataReader.getProperties(currentEnv).getProperty("user.login.name");
    public final String userPassword = PropertyDataReader.getProperties(currentEnv).getProperty("user.password");
    public final String SMALL_PICTURE_PATH = PropertyDataReader.getProperties(currentEnv).getProperty("1.pic.path");
    public final String BIG_PICTURE_PATH = PropertyDataReader.getProperties(currentEnv).getProperty("2.pic.path");

    @BeforeSuite(alwaysRun = true)
    void beforeSuiteSetUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide().enableLogs(LogType.BROWSER, Level.ALL)
        );
    }

    @AfterClass(alwaysRun = true)
    public void clearBrowser() {
        clearBrowserCookies();
        open(BLANK_PAGE);
    }
}
