package com.github.soydivision.tests.media.image;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.element;

public class BigImageUploadAndRemove extends CommonTestConditions {
    @Test(groups = {"media", "all"}, description = "user can upload big image", priority = 1)
    public void uploadBigImage() {
        getIndexPage().openPage();
        Selenide.sleep(2000);
        getIndexPage().logIn();
        Selenide.sleep(2000);
        getIndexPage().openGallery();
        Selenide.sleep(2000);
        getGalleryPage().uploadImage(BIG_PICTURE_PATH);
        element(Selectors.byXpath("//span[contains(.,'Upload Complete. ')]")).shouldBe(Condition.exist, Duration.ofSeconds(60));
    }

    @Test(groups = {"media", "all"}, description = "user can remove big picture", priority = 2)
    public void removeBigImage() {
        getIndexPage().openGallery();
        getGalleryPage().removeImage();
        element(Selectors.byXpath("//*[contains(text(),' Image deleted. Redirecting... ')]")).should(Condition.exist, Duration.ofSeconds(30));
    }
}
