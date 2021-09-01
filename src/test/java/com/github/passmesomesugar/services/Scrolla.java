package com.github.passmesomesugar.services;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.sleep;

public class Scrolla {
    private Scrolla() {
    }

    public static void scrollUntilElementIsVisible(SelenideElement element) {
        while (!element.exists()) {
            executeJavaScript("window.scrollTo(0,document.body.scrollHeight);");
            sleep(1000);
        }
    }
}
