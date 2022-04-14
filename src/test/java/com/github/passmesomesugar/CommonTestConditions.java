package com.github.passmesomesugar;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.passmesomesugar.services.PropertyDataReader;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.logging.Level;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class CommonTestConditions {
    public String MAIN_URL = "https://boardgamegeek.com";
    public String currentEnv = System.getProperty("env");
    public String BLANK_PAGE =
            System.getProperty("user.dir").concat("\\").concat("\\src\\test\\resources\\blankpage.html");
    /*
     * Please set a valid username and password in a "prod-env.properties" file and put it in "\src\test\resources".
     * File contents:
     * user.login.name=some_real_username
     * user.password=some_real_password
     * excluded.websites.to.check=youtube linkedin /user/ ~ or any other websites you don't want to check separated by space
     * */
    public String userLogin = PropertyDataReader.getProperties(currentEnv).getProperty("user.login.name");
    public String userPassword = PropertyDataReader.getProperties(currentEnv).getProperty("user.password");



    @BeforeTest
    public void actionsBeforeTest() {
        // logger.info("Test " + this.getClass().getName() + " started");
    }

    @AfterTest
    public void actionsAfterTest() {
        // logger.info("Test " + this.getClass().getName() + " finished");
    }

    @BeforeSuite(alwaysRun = true)
    void genesis() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide().enableLogs(LogType.BROWSER, Level.ALL)
        );

    }

    @AfterSuite(alwaysRun = true)
    void loggingEndOfSuite() {

    }
}
