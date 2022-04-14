package com.github.passmesomesugar.straightforward_pattern_tests.account;

import com.codeborne.selenide.Selectors;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class EditInterests extends CommonTestConditions {

    @Test(groups = "this", description = "one can edit interests")
    public void editInterests() {
      //  logIn();
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Account")).click();
        sleep(2000);
        element(Selectors.byLinkText("Edit Interests")).scrollIntoView(false);
        element(Selectors.byLinkText("Edit Interests")).click();
        element(Selectors.byId("hobbies")).setValue("collecting butterflies");
        element(Selectors.byId("favoritebooks")).setValue("Gucci mane's autobiography");
        element(Selectors.byId("favoritemovies")).setValue("Robert B. Weide movies");
        element(Selectors.byId("favoritemusic")).setValue("Metallica");
        element(Selectors.byId("favoritetvshows")).setValue("Curb your enthusiasm");
        element(Selectors.byXpath("//input[@value='Submit'] ")).click();

        open(MAIN_URL);
        element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        element(Selectors.byLinkText("Profile")).click();



        sleep(5000);
    }
}
