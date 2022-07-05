package com.github.passmesomesugar.page_objects;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.github.passmesomesugar.CommonTestConditions;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;
import static com.github.passmesomesugar.services.Scrolla.scrollUntilElementExists;

public class Index extends CommonTestConditions {

    private SelenideElement signInButton = element(Selectors.byText("Sign In"));
    private SelenideElement userNameButton = element(Selectors.byText(userLogin));
    private SelenideElement profileButton = element(Selectors.byXpath("//a[normalize-space(text()) = 'Profile']"));
    private SelenideElement signOutButton = element(Selectors.byLinkText("Sign Out"));
    private SelenideElement BGGLogoButtonDropdown = element(Selectors.byXpath("//*[contains(@class, 'menu-logo-inner')]//button"));
    private SelenideElement BGGLogoButtonDropdownElement = element(Selectors.byXpath("//*[contains(@class, 'menu-logo-inner')]//a[contains(text(),\"RPGGeek\")]"));
    private SelenideElement searchBar = element(Selectors.byCssSelector("input[name='searchTerm']"));
    private SelenideElement galleryButton = element(Selectors.byText("Gallery"));
    private SelenideElement aboutButton = element(Selectors.byText("About"));


//    element(Selectors.byCssSelector("input[name='username']")).setValue(userLogin);
//    element(Selectors.byCssSelector("input[name='password']")).setValue(userPassword);
//    element(Selectors.byXpath("//button[text()=' Sign In ']")).click();

    public void openPage() {
        open(MAIN_URL);
    }

    public void logIn() {
        signInButton.click();
        element(Selectors.byCssSelector("input[name='username']")).setValue(userLogin);
        element(Selectors.byCssSelector("input[name='password']")).setValue(userPassword);
        element(Selectors.byXpath("//button[text()=' Sign In ']")).click();
    }

    public void logOut() {
        //element(Selectors.byXpath("//span[text()=' " + userLogin + " ']")).click();
        userNameButton.click();
        signOutButton.click();
    }

    public void search(String searchQuery) {
        searchBar.setValue(searchQuery).pressEnter();
    }

    public void openProfile() {
        userNameButton.click();
        profileButton.click();
    }

    public void clickBGGDropDown() {
        BGGLogoButtonDropdown.click();
    }

    public void clickOn(String elementText) {
        element(Selectors.byXpath("//a[normalize-space(text()) = '" + elementText + "']")).click();
    }

    public void openGallery() {
        userNameButton.click();
        galleryButton.click();
        Selenide.sleep(2000);
    }

    public void clickAbout() {
        scrollUntilElementExists(aboutButton);
        aboutButton.click();
    }
}
