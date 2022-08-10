package com.github.passmesomesugar.page_objects;

import com.github.passmesomesugar.services.PropertyDataReader;

public abstract class AbstractPage {
  public final String MAIN_URL = "https://boardgamegeek.com";
  public final String currentEnv = System.getProperty("env");
  public final String userLogin =
      PropertyDataReader.getProperties(currentEnv).getProperty("user.login.name");
  public final String userPassword =
      PropertyDataReader.getProperties(currentEnv).getProperty("user.password");
  public final String SMALL_PICTURE_PATH =
      PropertyDataReader.getProperties(currentEnv).getProperty("1.pic.path");
  public final String BIG_PICTURE_PATH =
      PropertyDataReader.getProperties(currentEnv).getProperty("2.pic.path");
}
