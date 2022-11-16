package com.github.soydivision.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.github.soydivision.CommonTestConditions;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.sleep;

public class Gallery extends CommonTestConditions {
    public void uploadImage(String path) {
        Selenide.sleep(1500);
        element(Selectors.byXpath("//a[contains(text(),'Upload Image')]/fa-icon")).click();
        element(Selectors.byXpath("//*[contains(text(),'Choose Images')]//input"))
                .uploadFile(new File(path));
        sleep(5000);
        element(Selectors.byXpath("//button[contains(.,'Upload all')]")).click();
        element(Selectors.byXpath("//span[contains(.,'Upload Complete. ')]")).shouldBe(Condition.exist, Duration.ofSeconds(60));
    }

    public void removeImage() {
        element(Selectors.byXpath("//gg-image-browser//gg-image")).click();
        element(Selectors.byXpath("//button[text()=' Edit ']")).click();
        element(Selectors.byXpath("//button[text()=' Delete Image ']")).click();
        //element(Selectors.byXpath("//button[text()=' Yes, Delete Image ']")).click();
        element(Selectors.byText("Yes, Delete Image")).click();
        element(Selectors.byXpath("//*[contains(text(),' Image deleted. Redirecting... ')]")).should(Condition.exist, Duration.ofSeconds(30));
    }
}
