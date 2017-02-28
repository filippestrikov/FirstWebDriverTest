package com.facebook.tests;

import org.testng.annotations.DataProvider;

/**
 * Created by FILIP on 2/25/2017.
 */
public class FacebookData {

     @DataProvider(name = "login")
    public static Object[][] login() {
        return new Object[][]{
                {"filip.pestrikov@gmail.com", "sabaka1992", null},
                {"","sabaka1992", "Blank Email"},
                {"filip.pestrikov@gmail.com","", "Blank Password"}
        };
    }
}


