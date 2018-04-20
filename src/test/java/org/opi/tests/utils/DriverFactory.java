package org.opi.tests.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    public static final String USERNAME = "mateusz211";
    public static final String AUTOMATE_KEY = "zvLf6Yzqm13xLq1hFaxZ";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public WebDriver getRemoteDriver(String browserValue) {

        WebDriver driver = null;
        DesiredCapabilities caps = new DesiredCapabilities();
        switch (browserValue) {
            case "EDGE":

                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "16.0");
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("resolution", "1920x1080");
                break;

            case "CHROME":
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "49.0");
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "XP");
                caps.setCapability("resolution", "1920x1080");
                break;
        }

        try {
            driver = new RemoteWebDriver(new URL(URL), caps);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;

    }

}
