package com.facebook.tests.Pages;

import java.lang.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by user on 18.03.2017.
 */
public class DifusionMainPage {

        public static final String DIFUSION_PAGE_TITLE = "Campus Difusión";
        public static final String DIFUSION_PAGE_URL = "http://web.dif-unity-stage.avallain.net/register?role=student";


        @FindBy(id = "registration_sign_up_without_token_input_first_name")
        WebElement firstNameField;
        @FindBy(id = "registration_sign_up_without_token_input_last_name")
        WebElement lastNameField;
        @FindBy(id = "registration_sign_up_without_token_input_email")
        WebElement emailField;
        @FindBy(id = "registration_sign_up_without_token_input_password")
        WebElement passwordField;
        @FindBy(id = "registration_sign_up_without_token_input_password_confirmation")
        WebElement confirmPassField;
        @FindBy(css = ".btn.btn-action.high.less-roundy")
        WebElement accountButton;

        WebDriver driver;

        public DifusionMainPage(WebDriver driver) {this.driver = driver;}

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
            passwordField.sendKeys(text);
            Assert.assertEquals(passwordField.getAttribute("value"), text);
        }
        public void setText_confirmPassField(String text) {
            confirmPassField.sendKeys(text);
            Assert.assertEquals(confirmPassField.getAttribute("value"), text);
        }
        public void setText_CreateAccountButton() {
            accountButton.click();
        }

}
