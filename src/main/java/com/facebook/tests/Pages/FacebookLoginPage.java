package com.facebook.tests.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class FacebookLoginPage {

    public static final String PAGE_TITLE_LOGIN = "Log into Facebook | Facebook";
    public static final String PAGE_URL_LOGIN = "https://www.facebook.com/login.php?login_attempt=1&lwv=110";

    @FindBy(css = "#_50f6")  WebElement logIntoFacebook;


    public boolean checkLoginFormHeader(String text) {
        try {
            return logIntoFacebook.equals(text);
        }
        catch (NoSuchElementException e){
            return false;
        }
    }
}