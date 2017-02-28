package com.facebook.tests;

import com.facebook.tests.Pages.FacebookLoginPage;
import com.facebook.tests.Pages.FacebookMainFeed;
import com.facebook.tests.Pages.FacebookMainPage;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.firefox.MarionetteDriver;


public class Login_Test {

    public WebDriver driver;
    FacebookMainPage fbMainPage;
    FacebookLoginPage fbkLoginPage;
    FacebookMainFeed fbMainFeed;


    @BeforeClass(alwaysRun = true)
    public void setUp() {
        String currentDir = System.getProperty("user.dir");
        String marionetteDriverLocation = currentDir + "/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", marionetteDriverLocation);
        driver = new MarionetteDriver();
        fbMainPage = PageFactory.initElements(driver, FacebookMainPage.class);
        driver.manage().window().maximize();
        fbkLoginPage = PageFactory.initElements(driver, FacebookLoginPage.class);
        fbMainFeed = PageFactory.initElements(driver, FacebookMainFeed.class);
    }

    @AfterClass(alwaysRun = true)
    public void TearDown() {
        driver.quit();
    }

    @Test(groups = "p1", dataProviderClass = FacebookData.class, dataProvider = "login")
    public void testLoginPage(String email, String password, String loginPage){
        driver.get(fbMainPage.PAGE_URL);
        assertEquals(driver.getTitle(), fbMainPage.PAGE_TITLE);
        fbMainPage.setText_EmailLogin(email);
        fbMainPage.setText_PasswordLogin(password);
        fbMainPage.setLoginButton();

        if(!StringUtils.isBlank(loginPage)){
            boolean result = fbkLoginPage.checkLoginFormHeader(loginPage);
            assertTrue(result, "Expected Error " + loginPage);
        }
        else{
            assertTrue(!fbMainFeed.get_ProfileName().isEmpty());
        }
    }
}
