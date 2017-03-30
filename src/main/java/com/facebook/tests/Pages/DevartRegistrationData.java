package com.facebook.tests.Pages;

import org.testng.annotations.DataProvider;

/**
 * Created by user on 18.03.2017.
 */
public class DevartRegistrationData {

    @DataProvider(name = "registration")
    public static Object[][] registration() {
        return new Object[][]{
                {"Filip", "Pestrikov","filip.pestrikoff@gmail.com","Devart"},
                {"", "Pestrikov","filip.pestrikoff@gmail.com","Devart"},
                {"Filip", "","filip.pestrikoff@gmail.com","Devart"},
                {"Filip", "Pestrikov","","Devart"},
                {"Filip", "Pestrikov","filip.pestrikoff@gmail.com",""},

        };
    }
}
