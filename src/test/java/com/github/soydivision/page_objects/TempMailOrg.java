package com.github.soydivision.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.github.soydivision.CommonTestConditions;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class TempMailOrg extends CommonTestConditions {
    private SelenideElement copyButton = element(Selectors.byAttribute("data-clipboard-action", "copy"));


    public void openPage() {
        open("https://temp-mail.org/en/");
    }

    public void copyMail() {
        copyButton.click(usingJavaScript());
    }

}
