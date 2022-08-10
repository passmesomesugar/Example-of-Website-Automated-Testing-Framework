package com.github.passmesomesugar.page_object_pattern_tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.passmesomesugar.page_objects.AbstractPagesFactory;
import com.github.passmesomesugar.page_objects.ConcretePagesFactory;
import com.github.passmesomesugar.services.PropertyDataReader;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.logging.Level;

public class CommonTestConditions2 {
  public AbstractPagesFactory pagesFactory = new ConcretePagesFactory();

  @BeforeTest
  public void actionsBeforeTest() {
    // logger.info("Test " + this.getClass().getName() + " started");
  }

  @AfterTest
  public void actionsAfterTest() {
    // logger.info("Test " + this.getClass().getName() + " finished");
  }

  @BeforeSuite(alwaysRun = true)
  void beforeSuiteSetUp() {
    Configuration.browserSize = "1920x1080";
    Configuration.timeout = 10000;
    SelenideLogger.addListener(
        "AllureSelenide", new AllureSelenide().enableLogs(LogType.BROWSER, Level.ALL));
  }

  @AfterSuite(alwaysRun = true)
  void afterSuiteSetUp() {}
}
