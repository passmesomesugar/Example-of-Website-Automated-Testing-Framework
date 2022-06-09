package com.github.passmesomesugar.page_objects;

import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;

import java.io.File;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.sleep;

public class Gallery extends CommonTestConditions {

//    File file =
//            element(Selectors.byXpath("//*[contains(text(),'Choose Images')]//input"))
//                    .uploadFile(new File("C:\\Users\\PC\\Desktop\\workdir\\Java\\Showcase Testing Framework\\src\\test\\resources\\img\\2.png"));


    public void uploadImage(String path) {
        element(Selectors.byLinkText("Upload Image")).click();
        File file =
                element(Selectors.byXpath("//*[contains(text(),'Choose Images')]//input"))
                        .uploadFile(new File(path));
        sleep(5000);
        element(Selectors.byXpath("//button[contains(.,'Upload all')]")).click();
    }
}
