package com.github.passmesomesugar.page_objects;

public abstract class AbstractPagesFactory {
  public abstract AbstractPage getPage(String name);

  public abstract void openPage();
}
