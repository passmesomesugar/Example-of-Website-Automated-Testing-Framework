package com.github.passmesomesugar.smoke;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasicTestConditions {
    public String BASEURL = "https://boardgamegeek.com";
    public int URL_CHECKS_TIMEOUT = 4000;

    @BeforeTest
    public void actionsBeforeTest() {
        System.out.println("Test " + this.getClass().getName() + " started");
    }

    @AfterTest
    public void actionsAfterTest() {
        System.out.println("Test " + this.getClass().getName() + " finished");
    }
}
