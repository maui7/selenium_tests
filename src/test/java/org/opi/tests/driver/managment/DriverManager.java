package org.opi.tests.driver.managment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.opi.tests.utils.DriverFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    public static final String USERNAME = "mateusz211";
    public static final String AUTOMATE_KEY = "zvLf6Yzqm13xLq1hFaxZ";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();

    private DriverManager() {

    }

    public synchronized static WebDriver createWebDriver(String driverToRun) {
        DriverFactory driverFactory = new DriverFactory();
        WebDriver webDriver = driverFactory.getRemoteDriver(driverToRun);
        threadLocal.set(webDriver);
        return threadLocal.get();
    }

    public synchronized static WebDriver getDriver() {

        if (threadLocal.get() == null) {
            throw new IllegalStateException("Please run createWebDriver before calling getDriver");
        }
        return threadLocal.get();
    }

    public synchronized static void disposeDriver() {
        threadLocal.get().quit();
        threadLocal.remove();
    }
}
