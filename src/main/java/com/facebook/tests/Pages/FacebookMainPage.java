package com.facebook.tests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.w3c.dom.html.HTMLInputElement;

/**
 * Created by FILIP on 2/25/2017.
 */
public class FacebookMainPage {

    public static final String PAGE_TITLE = "Facebook - Log In or Sign Up";
    public static final String PAGE_URL = "http://www.facebook.com";


    @FindBy(id = "email")
    WebElement field_EmailLogin;
    @FindBy(id = "pass")
    WebElement field_PasswordLogin;
    @FindBy(id = "loginbutton")
    WebElement loginButton;


    WebDriver driver;

    public FacebookMainPage(WebDriver driver) {this.driver = driver;}

    public void setText_EmailLogin(String text) {
        field_EmailLogin.sendKeys(text);
        Assert.assertEquals(field_EmailLogin.getAttribute("value"), text);
    }

    public void setText_PasswordLogin(String text) {
        field_PasswordLogin.sendKeys(text);
        Assert.assertEquals(field_PasswordLogin.getAttribute("value"), text);
    }
    public void setLoginButton() {
        loginButton.click();
    }
}