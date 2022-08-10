//package com.github.passmesomesugar.page_objects;
//
//import com.codeborne.selenide.Selectors;
//import com.codeborne.selenide.Selenide;
//import com.codeborne.selenide.SelenideElement;
//import com.github.passmesomesugar.CommonTestConditions;
//
//import static com.codeborne.selenide.Selenide.element;
//import static com.codeborne.selenide.Selenide.open;
//import static com.github.passmesomesugar.services.Scrolla.scrollUntilElementExists;
//
//public class Index extends CommonTestConditions {
//
//    private SelenideElement signInButton = element(Selectors.byText("Sign In"));
//    private SelenideElement userNameButton = element(Selectors.byText(userLogin));
//    private SelenideElement profileButton = element(Selectors.byXpath("//a[normalize-space(text()) = 'Profile']"));
//    private SelenideElement signOutButton = element(Selectors.byLinkText("Sign Out"));
//    private SelenideElement BGGLogoButtonDropdown = element(Selectors.byXpath("//*[contains(@class, 'menu-logo-inner')]//button"));
//    private SelenideElement BGGLogoButtonDropdownElement = element(Selectors.byXpath("//*[contains(@class, 'menu-logo-inner')]//a[contains(text(),\"RPGGeek\")]"));
//    private SelenideElement searchBar = element(Selectors.byCssSelector("input[name='searchTerm']"));
//    private SelenideElement galleryButton = element(Selectors.byText("Gallery"));
//    private SelenideElement aboutButton = element(Selectors.byText("About"));
//    private SelenideElement FacebookLink = element(Selectors.byAttribute("data-icon", "facebook-square"));
//    private SelenideElement TwitterButton = element(Selectors.byAttribute("data-icon", "twitter"));
//    private SelenideElement InstLink = element(Selectors.byAttribute("data-icon", "instagram"));
//    private SelenideElement ytLink = element(Selectors.byAttribute("data-icon", "youtube"));
//    private SelenideElement twitchLink = element(Selectors.byAttribute("data-icon", "twitch"));
//    private SelenideElement discordLink = element(Selectors.byAttribute("data-icon", "discord"));
//
//    public void openPage() {
//        open(MAIN_URL);
//    }
//
//    public void logIn() {
//        signInButton.click();
//        element(Selectors.byCssSelector("input[name='username']")).setValue(userLogin);
//        element(Selectors.byCssSelector("input[name='password']")).setValue(userPassword);
//        element(Selectors.byXpath("//button[text()=' Sign In ']")).click();
//    }
//
//    public void logOut() {
//        userNameButton.click();
//        signOutButton.click();
//    }
//
//    public void search(String searchQuery) {
//        searchBar.setValue(searchQuery).pressEnter();
//    }
//
//    public void openProfile() {
//        userNameButton.click();
//        profileButton.click();
//    }
//
//    public void clickBGGDropDown() {
//        BGGLogoButtonDropdown.click();
//    }
//
//    public void clickOn(String elementText) {
//        element(Selectors.byXpath("//a[normalize-space(text()) = '" + elementText + "']")).click();
//    }
//
//    public void openGallery() {
//        userNameButton.click();
//        galleryButton.click();
//        Selenide.sleep(2000);
//    }
//
//    public void clickAbout() {
//        scrollUntilElementExists(aboutButton);
//        aboutButton.click();
//    }
//
//    public void clickFacebook() {
//        scrollUntilElementExists(FacebookLink);
//        FacebookLink.click();
//    }
//
//    public void clickTwitter() {
//        scrollUntilElementExists(TwitterButton);
//        TwitterButton.click();
//    }
//
//    public void clickInstagram() {
//        scrollUntilElementExists(InstLink);
//        InstLink.click();
//    }
//
//    public void clickYoutube() {
//        scrollUntilElementExists(ytLink);
//        ytLink.click();
//    }
//
//    public void clickTwitch() {
//        scrollUntilElementExists(twitchLink);
//        twitchLink.click();
//    }
//
//    public void clickDiscord() {
//        scrollUntilElementExists(discordLink);
//        discordLink.click();
//    }
//}
