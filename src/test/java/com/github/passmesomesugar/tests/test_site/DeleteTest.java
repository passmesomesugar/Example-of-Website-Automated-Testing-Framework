package com.github.passmesomesugar.tests.test_site;

import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeleteTest extends CommonTestConditions {
    private static final Logger logger = LogManager.getLogger(DeleteTest.class);

    @Test(groups = "this", description = "test site")
    public void someMethodToTestSomething() {
        logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");
    }
}