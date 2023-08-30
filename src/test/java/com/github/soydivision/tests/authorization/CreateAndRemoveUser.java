package com.github.soydivision.tests.authorization;

import com.codeborne.selenide.*;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


//https://10minemail.com/

public class CreateAndRemoveUser extends CommonTestConditions {
    @Test(groups = {"this", "all"}, description = "")
    public void registerNewUser() {
        Configuration.timeout = 15000;
        getTempMailOrg().openPage();

        SelenideElement tempMail = element(Selectors.byAttribute("data-original-title", "Your Temporary Email Address"));
        tempMail.should(Condition.exist);
        Selenide.sleep(10000);
        SelenideElement s = element(Selectors.byAttribute("data-clipboard-action", "copy"));
        actions().moveToElement(s).click(s).perform();
//        executeJavaScript("arguments[0].click();", element(Selectors.byAttribute("data-clipboard-action", "copy")));
        System.out.println("**************************");
        System.out.println(clipboard().getText());
        System.out.println("**************************");
        Selenide.sleep(8000);


        //
    }
}
