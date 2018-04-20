package org.opi.tests.tests;

import io.qameta.allure.Step;
import org.opi.tests.driver.managment.utils.DriverUtils;
import org.opi.tests.page.objects.HomePage;
import org.opi.tests.page.objects.LoginPage;
import org.testng.annotations.Test;

import static org.opi.tests.utils.EnviromentsUrls.LOGIN_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends TestBase {


    @Test
    public void asUserTryToLoginWithBadCredentials(){
        DriverUtils.navigateTo(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        String badPassword = loginPage
        .typeIntoEmailField("bad@mail.pl")
        .typeIntoPasswordField("badpassword")
        .clickOnSignInButton()
        .getWarningText();

        assertEquals(badPassword, "Authentication failed.");
    }

}
