package com.github.soydivision.tests.media.image;

import com.codeborne.selenide.Selenide;
import com.github.soydivision.CommonTestConditions;
import com.github.soydivision.services.PropertyDataReader;
import org.testng.annotations.Test;

public class BigImageUploadAndRemoveTest extends CommonTestConditions {
    public final String BIG_PICTURE_PATH = PropertyDataReader.getProperties(propFile).getProperty("2.pic.path");

    @Test(groups = "", description = "user can upload big image", priority = 1)
    public void uploadBigImage() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openGallery();
        getGalleryPage().uploadImage(BIG_PICTURE_PATH);
        Selenide.sleep(4000);

    }

    @Test(groups = "", description = "user can remove big picture", priority = 2)
    public void removeBigImage() {
        getIndexPage().openGallery();
        getGalleryPage().removeImage();
        Selenide.sleep(4000);

    }
}
