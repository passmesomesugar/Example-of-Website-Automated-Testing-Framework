package com.github.passmesomesugar.tests.image;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class ImageUploadTest extends CommonTestConditions {

    @Test(groups = "this", description = "this")
    public void uploadImage() {
        logIn();
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Gallery")).click();
        element(Selectors.byLinkText("Upload Image")).click();
        //element(Selectors.byXpath("//*[contains(text(),'Choose Images')]")).click();
        sleep(5000);
        File file =
                element(Selectors.byXpath("//*[contains(text(),'Choose Images')]//input"))
                        .uploadFile(new File("C:\\Users\\PC\\Desktop\\workdir\\Java\\Showcase Testing Framework\\src\\test\\resources\\img\\HD_empty_image.png"));
        sleep(5000);
        element(Selectors.byXpath("//button[contains(.,'Upload all')]")).click();
        sleep(7000);
        element(Selectors.byXpath("//span[contains(.,'Upload Complete. ')]")).shouldBe(Condition.exist);
    }
}
