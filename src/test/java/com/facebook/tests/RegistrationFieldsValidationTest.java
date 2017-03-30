package com.facebook.tests;

import com.facebook.tests.Pages.DevartLoginOrRegisterPage;
import java.lang.String;
import java.util.concurrent.TimeUnit;

import com.facebook.tests.Pages.DevartRegistrationData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by user on 18.03.2017.
 */
public class RegistrationFieldsValidationTest {

    public WebDriver driver;
    DevartLoginOrRegisterPage devartLoginOrRegisterPage;

    @BeforeClass(alwaysRun = true)
    public void setUpDriver() {
        String currentDir = System.getProperty("user.dir");
        String marionetteDriverLocation = currentDir + "/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", marionetteDriverLocation);
        driver = new MarionetteDriver();
        driver.manage().window().maximize();
        devartLoginOrRegisterPage = PageFactory.initElements(driver, DevartLoginOrRegisterPage.class);
    }

    @AfterClass(alwaysRun = true)
    public void TearDown() {
        driver.quit();
    }

    @Test(groups = "p1", dataProviderClass = DevartRegistrationData.class, dataProvider = "registration")
    public void registrationFormInputFields(String firstName, String lastName, String emailField, String companyField) {

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(devartLoginOrRegisterPage.DIFUSION_PAGE_URL);
        assertEquals(driver.getTitle(), devartLoginOrRegisterPage.DIFUSION_PAGE_TITLE);
        devartLoginOrRegisterPage.setText_FirstNameField(firstName);
        devartLoginOrRegisterPage.setText_LastNameField(lastName);
        devartLoginOrRegisterPage.setText_EmailLField(emailField);
        devartLoginOrRegisterPage.setText_PasswordField(companyField);
        devartLoginOrRegisterPage.setText_CreateAccountButton();

    }
}