package com.github.soydivision.tests.media.image;

import com.codeborne.selenide.Selenide;
import com.github.soydivision.CommonTestConditions;
import com.github.soydivision.services.PropertyDataReader;
import org.testng.annotations.Test;

public class SmallImageUploadAndRemoveTest extends CommonTestConditions {
    public final String SMALL_PICTURE_PATH = PropertyDataReader.getProperties(propFile).getProperty("1.pic.path");

    @Test(groups = "", description = "user can upload small image", priority = 1)
    public void uploadBigImage() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openGallery();
        getGalleryPage().uploadImage(SMALL_PICTURE_PATH);
        Selenide.sleep(IMAGE_UPLOAD_TIMEOUT);
    }

    @Test(groups = "", description = "user can remove small image", priority = 2)
    public void removeBigImage() {
        getIndexPage().openGallery();
        getGalleryPage().removeImage();
        Selenide.sleep(IMAGE_UPLOAD_TIMEOUT);
    }
}
