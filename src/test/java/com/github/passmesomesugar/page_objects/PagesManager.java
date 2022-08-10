//package com.github.passmesomesugar.page_objects;
//
//import com.codeborne.selenide.WebDriverRunner;
//import com.github.passmesomesugar.CommonTestConditions;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//
//import java.util.function.Supplier;
//
//public class PagesManager {
//    // private Index indexPage;
//
//    private Profile profilePage;
//
//    private Gallery gallery;
//
////    public Index getIndexPage() {
////        return indexPage;
////    }
//
//    public static Index getIndexPage(Supplier<? extends CommonTestConditions> s) {
//        Index index = s.get();
//        return index;
//
//    }
//
//    public Gallery getGalleryPage() {
//        return gallery;
//    }
//
//    public static Profile supplyProfile(Supplier<? extends CommonTestConditions> supplier) {
//        Profile profile = (Profile) supplier.get();
//        return profile;
//    }
//
//
//    public Profile getProfilePage() {
//        return profilePage;
//    }
//
//    @BeforeClass(alwaysRun = true)
//    public void setUpPages() {
//        indexPage = new Index();
//        gallery = new Gallery();
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void afterClassActions() {
//        WebDriverRunner.closeWebDriver(); // or clear cookies?
//    }
//
//
//}
