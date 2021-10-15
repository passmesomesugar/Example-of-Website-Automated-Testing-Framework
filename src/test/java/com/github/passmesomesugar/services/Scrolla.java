package com.github.passmesomesugar.services;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.sleep;

public class Scrolla {
    private Scrolla() {
    }

    public static void scrollUntilElementExists(SelenideElement element) {
        while (!element.exists()) {
            executeJavaScript("window.scrollTo(0,document.body.scrollHeight);");
            executeJavaScript("window.scrollBy(0,-200)", "");
        }
    }
}
