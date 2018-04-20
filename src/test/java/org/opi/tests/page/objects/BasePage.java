package org.opi.tests.page.objects;

import org.openqa.selenium.support.PageFactory;
import org.opi.tests.driver.managment.DriverManager;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
}
