package com.github.passmesomesugar;

import com.codeborne.selenide.Selenide;
import com.github.passmesomesugar.services.PropertyDataReader;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonTestConditions {
    public String BASEURL = "https://boardgamegeek.com";
    public int URL_CHECKS_TIMEOUT = 4000;
    public String currentEnv = System.getProperty("env");
    public String BLANKPAGE =
            System.getProperty("user.dir").concat("\\").concat("\\src\\test\\resources\\blankpage.html");
    /*
     * Please set a valid username and password in a "prod-env.properties" file and put it in "\src\test\resources".
     * File contents:
     * user.login.name=some_real_username
     * user.password=some_real_password
     * */
    public String userLogin = PropertyDataReader.getProperties(currentEnv).getProperty("user.login.name");
    public String userPassword = PropertyDataReader.getProperties(currentEnv).getProperty("user.password");

    public void openBlank() {
        Selenide.open(BLANKPAGE);
    }

    @BeforeTest
    public void actionsBeforeTest() {
        System.out.println("Test " + this.getClass().getName() + " started");
    }

    @AfterTest
    public void actionsAfterTest() {
        System.out.println("Test " + this.getClass().getName() + " finished");
    }
}
