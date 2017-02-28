package com.facebook.tests.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 28.02.2017.
 */
public class FacebookMainFeed {

    @FindBy(id = "u_0_5")
    WebElement ProfileName;

    public String get_ProfileName() {
        return ProfileName.getText();
    }
}