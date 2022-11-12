package com.github.soydivision.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.github.soydivision.CommonTestConditions;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.element;

public class Profile extends CommonTestConditions {

    private SelenideElement editButton = element(Selectors.byXpath("//div[@class='profile_block']/*[contains(.,'User Profile for JacksonGomer')]//img[@alt='edit']"));
    private SelenideElement textArea = element(Selectors.byCssSelector("textarea"));
    private SelenideElement submit = element(Selectors.byAttribute("value", "Submit"));
    private SelenideElement send = element(Selectors.byAttribute("value", "Send"));
    private SelenideElement profileUpdateSuccessText = element(Selectors.byText("Updated Your Profile"));
    private SelenideElement messageSubject = element(Selectors.byAttribute("id", "geekmail-subject"));
    private SelenideElement geekMail = element(Selectors.byText("Send Private Message to " + userLogin));

    public void editUserProfile() {
        editButton.click();
    }

    public void sendText(String... text) {
        if (text.length == 0) {
            textArea.sendKeys(Keys.CONTROL, "a");
            textArea.sendKeys(Keys.DELETE);
        } else {
            textArea.click();
            textArea.sendKeys(text);
        }
    }

    public void submit() {
        submit.click();
    }

    public void sendMessage() {
        send.click();
    }

    public void checkSuccessfulUpdateMessage() {
        profileUpdateSuccessText.should(Condition.exist);
    }

    public void sendPrivateMessage() {
        geekMail.click();
    }

    public void setSubject(String text) {
        messageSubject.click();
        messageSubject.sendKeys(text);
    }
}
