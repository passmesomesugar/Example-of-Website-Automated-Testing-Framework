package com.github.passmesomesugar.page_object_pattern_tests.media.image;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.element;

public class ImageUploadAndRemove extends CommonTestConditions {
    @Test(groups = "media", description = "user can upload image", priority = 1)
    public void uploadImage() {
        getIndexPage().openPage();
        Selenide.sleep(2000);
        getIndexPage().logIn();
        Selenide.sleep(2000);
        getIndexPage().openGallery();
        Selenide.sleep(2000);
        getGalleryPage().uploadImage(picture3path_big);
        element(Selectors.byXpath("//span[contains(.,'Upload Complete. ')]")).shouldBe(Condition.exist, Duration.ofSeconds(60));
    }

    @Test(groups = "media", description = "user can remove uploaded picture", priority = 2)
    public void removeImage() {
        getIndexPage().openGallery();
        getGalleryPage().removeImage();
        element(Selectors.byXpath("//*[contains(text(),' Image deleted. Redirecting... ')]")).shouldHave(Condition.exist, Duration.ofSeconds(30));
    }
}
