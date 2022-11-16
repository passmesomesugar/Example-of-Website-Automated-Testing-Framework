package com.github.soydivision.tests.media.image;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

public class BigImageUploadAndRemove extends CommonTestConditions {
    @Test(groups = {"media", "all"}, description = "user can upload big image", priority = 1)
    public void uploadBigImage() {
        getIndexPage().openPage();
        getIndexPage().logIn();
        getIndexPage().openGallery();
        getGalleryPage().uploadImage(BIG_PICTURE_PATH);
    }

    @Test(groups = {"media", "all"}, description = "user can remove big picture", priority = 2)
    public void removeBigImage() {
        getIndexPage().openGallery();
        getGalleryPage().removeImage();
    }
}
