package com.github.passmesomesugar.tests;

import com.codeborne.selenide.Selenide;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Delete2 extends CommonTestConditions {


    @Test(groups = "smo")
    public void deleteTwo() {
        open(MAIN_URL);
        executeJavaScript("window.open('about:blank','_blank')");
        Selenide.switchTo().window(1);
        open("https://google.kz/");
        sleep(2000);
        Selenide.switchTo().window(0);
        sleep(2000);
        Selenide.switchTo().window(1);
        sleep(2000);
        Selenide.switchTo().window(0);
    }

}
