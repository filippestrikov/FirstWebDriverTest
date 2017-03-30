package com.facebook.tests.Pages;

import org.testng.annotations.DataProvider;

/**
 * Created by user on 18.03.2017.
 */
public class DifusionRegistrationData {

    @DataProvider(name = "registration")
    public static Object[][] registration() {
        return new Object[][]{
                {"Filip", "Pestrikov", "filip.pestrikoff@gmail.com", "Sabaka1992", "Sabaka1992"},
                {"Filip", "Pestrikov", "filip.pestrikoff@gmail.com", "Sabaka1992", ""},
                {"Filip", "Pestrikov", "filip.pestrikoff@gmail.com","", "Sabaka1992"},
                {"Filip", "Pestrikov", "", "Sabaka1992", "Sabaka1992"},
                {"Filip", "", "filip.pestrikoff@gmail.com", "Sabaka1992", "Sabaka1992"},
                {"", "Pestrikov", "filip.pestrikoff@gmail.com", "Sabaka1992", "Sabaka1992"},
        };
    }
}
