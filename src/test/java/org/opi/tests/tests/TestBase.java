package org.opi.tests.tests;

import org.opi.tests.driver.managment.DriverManager;
import org.opi.tests.driver.managment.utils.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static org.opi.tests.utils.EnviromentsUrls.MAIN_APP_URL;

public class TestBase {

    @Parameters("browser")
    @BeforeMethod
    public void setup(@Optional("CHROME") String browser) {
        DriverManager.createWebDriver(browser);
        DriverManager.getDriver().manage().window().maximize();
        DriverUtils.navigateTo(MAIN_APP_URL);

    }


    @AfterMethod
    public void tearDown() {
        DriverManager.disposeDriver();
    }
}