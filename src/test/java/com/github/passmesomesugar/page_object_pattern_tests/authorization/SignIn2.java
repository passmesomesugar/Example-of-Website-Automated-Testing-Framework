package com.github.passmesomesugar.page_object_pattern_tests.authorization;

import com.github.passmesomesugar.page_object_pattern_tests.CommonTestConditions2;
import com.github.passmesomesugar.page_objects.AbstractPage;
import org.testng.annotations.Test;

public class SignIn2 extends CommonTestConditions2 {
  @Test(groups = "this", description = "one can sign-in and sign-out test")
  public void signInAndSignOut() {
    AbstractPage index = pagesFactory.getPage("index");
    index.logIn();
  }
}
