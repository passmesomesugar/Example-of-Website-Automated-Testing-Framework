package com.github.soydivision.tests.media.image;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.element;

public class SmallImageUploadAndRemove extends CommonTestConditions {
    @Test(groups = {"media", "all"}, description = "user can upload small image", priority = 1)
    public void uploadBigImage() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openGallery();
        getGalleryPage().uploadImage(SMALL_PICTURE_PATH);
        element(Selectors.byXpath("//span[contains(.,'Upload Complete. ')]")).shouldBe(Condition.exist, Duration.ofSeconds(60));
    }

    @Test(groups = {"media", "all"}, description = "user can remove small image", priority = 2)
    public void removeBigImage() {
        getIndexPage().openGallery();
        getGalleryPage().removeImage();
        element(Selectors.byXpath("//*[contains(text(),' Image deleted. Redirecting... ')]")).should(Condition.exist, Duration.ofSeconds(30));
    }
}
