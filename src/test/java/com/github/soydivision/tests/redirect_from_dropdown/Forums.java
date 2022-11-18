package com.github.soydivision.tests.redirect_from_dropdown;

import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

public class Forums extends CommonTestConditions {

    @Test(groups = {"this", "all"}, description = "")
    public void allForums() {
        getIndexPage().openPage();
        getIndexPage().clickDropdownByName("Forums");
        getIndexPage().clickOnByText("All Forums");
    }


}
