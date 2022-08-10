package com.github.passmesomesugar.page_objects;

public class ConcretePagesFactory extends AbstractPagesFactory {
  @Override
  public AbstractPage getPage(String name) {
    AbstractPage abstractPage;
    switch (name.toLowerCase()) {
      case "index":
        abstractPage = new Index2();
        break;
      default:
        throw new IllegalStateException("Unexpected value: no such page" + name.toLowerCase());
    }
    return new Index2();
  }

  @Override
  public void openPage() {}
}
