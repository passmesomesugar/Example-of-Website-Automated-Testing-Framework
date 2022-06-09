package com.github.passmesomesugar.page_object_pattern_tests.media.image;

import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class ImageUploadAndRemove extends CommonTestConditions {
    @Test(groups = "this", description = "user can upload image", priority = 1)
    public void uploadImage() {
        String path = "C:\\Users\\PC\\Desktop\\workdir\\Java\\Showcase Testing Framework\\src\\test\\resources\\img\\2.png";

        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openGallery();
        getGalleryPage().uploadImage(path);
        sleep(10000);

//        sleep(2000);
//
//        sleep(2000);
//        element(Selectors.byXpath("//span[contains(.,'Upload Complete. ')]")).shouldBe(Condition.exist, Duration.ofSeconds(20));
    }
//
//    @Test(groups = "smoke1", description = "user can remove uploaded picture", priority = 2)
//    public void removeImage() {
//        open(MAIN_URL);
//        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
//        element(Selectors.byLinkText("Gallery")).click();
//        element(Selectors.byXpath("//*[@class='flex-grow-1']//img")).click();
//        element(Selectors.byXpath("//button[text()=' Edit ']")).shouldHave(Condition.exist, Duration.ofSeconds(20));
//        element(Selectors.byXpath("//button[text()=' Edit ']")).click();
//        element(Selectors.byXpath("//button[text()=' Delete Image ']")).click();
//        element(Selectors.byXpath("//button[text()=' Yes, Delete Image ']")).click();
//        element(Selectors.byXpath("//*[contains(text(),' Image deleted. Redirecting... ')]")).shouldHave(Condition.exist, Duration.ofSeconds(10));
//        sleep(7000);
//        // logOut();
//    }

}
