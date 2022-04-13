package com.github.passmesomesugar.pageobjects;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class IndexPage {


    private SelenideElement signInButton =  element(Selectors.byText("Sign In"));
//    element(Selectors.byCssSelector("input[name='username']")).setValue(userLogin);
//    element(Selectors.byCssSelector("input[name='password']")).setValue(userPassword);
//    element(Selectors.byXpath("//button[text()=' Sign In ']")).click();

    void open(){

    }


}
