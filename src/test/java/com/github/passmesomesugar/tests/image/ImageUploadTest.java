package com.github.passmesomesugar.tests.image;

import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ImageUploadTest extends CommonTestConditions {

    @Test(groups = "this", description = "this")
    public void uploadImage() {
        logIn();
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Gallery")).click();
        element(Selectors.byLinkText("Upload Image")).click();
        element(Selectors.byXpath("//*[contains(text(),'Choose Images')]")).click();
        sleep(5000);
        /*https://github.com/selenide/selenide/blob/master/src/test/java/integration/FileUploadTest.java*/

    }
}
