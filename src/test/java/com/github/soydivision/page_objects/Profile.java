package com.github.soydivision.page_objects;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.github.soydivision.CommonTestConditions;

import static com.codeborne.selenide.Selenide.element;

public class Profile extends CommonTestConditions {

    private SelenideElement editButton = element(Selectors.byXpath("//div[@class='profile_block']/*[contains(.,'User Profile for JacksonGomer')]//img[@alt='edit']"));

    public void clickEdit() {
        editButton.click();
    }

}
