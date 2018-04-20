package org.opi.tests.driver.managment.utils;

import org.opi.tests.driver.managment.DriverManager;

public class DriverUtils {

    public static void navigateTo(String url){
        DriverManager.getDriver().navigate().to(url);

    }

}
