package com.github.passmesomesugar;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.services.PropertyDataReader;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class CommonTestConditions {
    public String MAIN_URL = "https://boardgamegeek.com";
    public int URL_CHECKS_TIMEOUT = 4000;
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

    public void logIn() {
        open(MAIN_URL);
        element(Selectors.byText("Sign In")).click();
        element(Selectors.byCssSelector("input[name='username']")).shouldHave(Condition.exist, Duration.ofSeconds(10));
        element(Selectors.byCssSelector("input[name='username']")).setValue(userLogin);
        element(Selectors.byCssSelector("input[name='password']")).setValue(userPassword);
        element(Selectors.byXpath("//button[text()=' Sign In ']")).click();
    }

    public void logOut() {
        open(MAIN_URL);
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Sign Out")).click();
    }

    @BeforeTest
    public void actionsBeforeTest() {
        // logger.info("Test " + this.getClass().getName() + " started");
    }

    @AfterTest
    public void actionsAfterTest() {
        // logger.info("Test " + this.getClass().getName() + " finished");
    }
}
