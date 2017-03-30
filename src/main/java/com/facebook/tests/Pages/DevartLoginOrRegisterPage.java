package com.facebook.tests.Pages;

import java.lang.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by user on 18.03.2017.
 */
public class DevartLoginOrRegisterPage {

        public static final String DIFUSION_PAGE_TITLE = "Devart - Log In or Register";
        public static final String DIFUSION_PAGE_URL = "https://www.devart.com/login.html";


        @FindBy(id = "_ctl0_middleContentPlaceHolder_userProfile_txtFirstName")
        WebElement firstNameField;
        @FindBy(id = "_ctl0_middleContentPlaceHolder_userProfile_txtLastName")
        WebElement lastNameField;
        @FindBy(id = "_ctl0_middleContentPlaceHolder_userProfile_txtEmail")
        WebElement emailField;
        @FindBy(id = "_ctl0_middleContentPlaceHolder_userProfile_txtCompany")
        WebElement companyField;
        @FindBy(id = "_ctl0_middleContentPlaceHolder_userProfile_btnRegister")
        WebElement accountButton;

        WebDriver driver;

        public DevartLoginOrRegisterPage(WebDriver driver) {this.driver = driver;}

        public void setText_FirstNameField(String text) {
            firstNameField.sendKeys(text);
            Assert.assertEquals(firstNameField.getAttribute("value"), text);
        }
        public void setText_LastNameField(String text) {
            lastNameField.sendKeys(text);
            Assert.assertEquals(lastNameField.getAttribute("value"), text);
        }
        public void setText_EmailLField(String text) {
            emailField.sendKeys(text);
            Assert.assertEquals(emailField.getAttribute("value"), text);
        }
        public void setText_PasswordField(String text) {
            companyField.sendKeys(text);
            Assert.assertEquals(companyField.getAttribute("value"), text);
        }
        public void setText_CreateAccountButton() {
            accountButton.click();
        }

}
