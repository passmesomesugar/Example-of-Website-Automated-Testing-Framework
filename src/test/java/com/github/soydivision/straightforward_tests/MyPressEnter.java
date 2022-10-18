package com.github.soydivision.straightforward_tests;

import com.codeborne.selenide.Command;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.WebElementSource;
import org.openqa.selenium.Keys;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class MyPressEnter implements Command<SelenideElement> {

    public MyPressEnter() {
    }
    @Nonnull
    public SelenideElement execute(SelenideElement proxy, WebElementSource locator, @Nullable Object[] args) {
        locator.findAndAssertElementIsInteractable().sendKeys(new CharSequence[]{Keys.ENTER});
        return proxy;
    }
}