package com.github.passmesomesugar.page_objects;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.github.passmesomesugar.CommonTestConditions;

import java.io.File;

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
    }

    public void removeImage() {
        element(Selectors.byXpath("//gg-image-browser//gg-image")).click();
        element(Selectors.byXpath("//button[text()=' Edit ']")).click();
        element(Selectors.byXpath("//button[text()=' Delete Image ']")).click();
        element(Selectors.byXpath("//button[text()=' Yes, Delete Image ']")).click();
    }
}
