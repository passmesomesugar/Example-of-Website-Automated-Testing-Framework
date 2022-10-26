package com.github.soydivision.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.github.soydivision.CommonTestConditions;

import static com.codeborne.selenide.Selenide.element;

public class Profile extends CommonTestConditions {

    private SelenideElement editButton = element(Selectors.byXpath("//div[@class='profile_block']/*[contains(.,'User Profile for JacksonGomer')]//img[@alt='edit']"));
    private SelenideElement descriptionArea = element(Selectors.byCssSelector("textarea"));
    private SelenideElement submit = element(Selectors.byAttribute("value", "Submit"));
    private SelenideElement profileUpdateSuccessText = element(Selectors.byText("Updated Your Profile"));

    public void edit() {
        editButton.click();
    }

    public void sendDescription(String text) {
        descriptionArea.click();
        descriptionArea.sendKeys(text);
    }

    public void submit() {
        submit.click();
    }

    public void checkSuccessfulUpdateMessage() {
        profileUpdateSuccessText.should(Condition.exist);
    }
}
