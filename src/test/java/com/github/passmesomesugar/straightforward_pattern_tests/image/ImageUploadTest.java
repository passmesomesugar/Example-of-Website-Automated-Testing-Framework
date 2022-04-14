package com.github.passmesomesugar.straightforward_pattern_tests.image;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class ImageUploadTest extends CommonTestConditions {

    @Test(groups = "smoke", description = "one can upload image", priority = 1)
    public void uploadImage() {
        //logIn();
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Gallery")).click();
        element(Selectors.byLinkText("Upload Image")).click();
        File file =
                element(Selectors.byXpath("//*[contains(text(),'Choose Images')]//input"))
                        .uploadFile(new File("C:\\Users\\PC\\Desktop\\workdir\\Java\\Showcase Testing Framework\\src\\test\\resources\\img\\2.png"));
        sleep(2000);
        element(Selectors.byXpath("//button[contains(.,'Upload all')]")).click();
        sleep(2000);
        element(Selectors.byXpath("//span[contains(.,'Upload Complete. ')]")).shouldBe(Condition.exist, Duration.ofSeconds(20));
    }

    @Test(groups = "smoke", description = "one can remove uploaded picture", priority = 2)
    public void removeImage() {
        open(MAIN_URL);
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Gallery")).click();
        element(Selectors.byXpath("//*[@class='flex-grow-1']//img")).click();
        element(Selectors.byXpath("//button[text()=' Edit ']")).shouldHave(Condition.exist, Duration.ofSeconds(20));
        element(Selectors.byXpath("//button[text()=' Edit ']")).click();
        element(Selectors.byXpath("//button[text()=' Delete Image ']")).click();
        element(Selectors.byXpath("//button[text()=' Yes, Delete Image ']")).click();
        element(Selectors.byXpath("//*[contains(text(),' Image deleted. Redirecting... ')]")).shouldHave(Condition.exist, Duration.ofSeconds(10));
        sleep(7000);
       // logOut();
    }


}
