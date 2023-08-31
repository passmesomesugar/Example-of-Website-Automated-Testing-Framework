package com.github.soydivision.page_objects;

import com.codeborne.selenide.*;
import com.github.soydivision.CommonTestConditions;

import static com.codeborne.selenide.Selenide.*;

public class TempMailPage extends CommonTestConditions {
    SelenideElement email = element(Selectors.byId("email"));

    public void openPage() {
        open("https://www.minuteinbox.com/");
    }

    public void copyEmailToClipboard() {
        clipboard().setText(email.getText());
    }
}
