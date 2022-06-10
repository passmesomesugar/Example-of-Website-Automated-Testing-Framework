package com.github.passmesomesugar.page_object_pattern_tests.media.image;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.sleep;

public class ImageUploadAndRemove extends CommonTestConditions {
    @Test(groups = "this", description = "user can upload image", priority = 1)
    public void uploadImage() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openGallery();
        getGalleryPage().uploadImage(picture3path_big);
        element(Selectors.byXpath("//span[contains(.,'Upload Complete. ')]")).shouldBe(Condition.exist, Duration.ofSeconds(60));
    }

    @Test(groups = "this", description = "user can remove uploaded picture", priority = 2)
    public void removeImage() {
        getIndexPage().openGallery();
        getGalleryPage().removeImage();
        element(Selectors.byXpath("//*[contains(text(),' Image deleted. Redirecting... ')]")).shouldHave(Condition.exist, Duration.ofSeconds(20));
        sleep(7000);
    }

}
