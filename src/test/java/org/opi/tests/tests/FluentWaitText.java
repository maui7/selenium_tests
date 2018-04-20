//package org.opi.tests.tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import static org.testng.Assert.assertTrue;
//
//public class FluentWaitText {
//
//
//    private WebDriver webDriver;
//
//    @BeforeMethod
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//        webDriver = new ChromeDriver();
//        webDriver.manage().window().maximize();
//        webDriver.navigate().to("file:///C:/Users/GeekON01/Desktop/Selenium/SeleniumIntro/selenium-basic/exercies/Fluent_Wait_Page.html");
//
//    }
//
//
//    @AfterMethod
//    public void tearDown() {
//        webDriver.quit();
//    }
//
////    @Test
////    public void fluentWaitTest(WebElement driver) {
////        webDriver.findElement(By.id("addText")).click();
////        WebDriverWait waitDriverWait = new WebDriverWait(webDriver, 10);
////        waitDriverWait.until(ExpectedConditions.textToBePresentInElement(webDriver.findElement(By.id("dynamicElement")), "dynamicText0"));
////
////        //******
////
////        webDriver.findElement(By.id("dynamicColour")).click();
////        WebDriverWait waitForButton = new WebDriverWait(webDriver,10);
////        waitForButton.until(ExpectedConditions.attributeContains(By.id("dynamicColour"), "style", "color: red;"));
////
////    }
//
//
//    @Test
//    public void fluentWaitTest() {
//        WebElement addTextButton = webDriver.findElement(By.id("addText"));
//        addTextButton.click();
//
//        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 10);
//        webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("dynamicElement"), "dynamicText0"));
//        WebElement buttonIsDisplayed = webDriver.findElement(By.id("dynamicElement"));
//        assertTrue(buttonIsDisplayed.isDisplayed());
//    }
//
//    //******
//
//    @Test
//    public void changeColorText() {
//        WebElement changeColor = webDriver.findElement(By.id("dynamicColour"));
//        changeColor.click();
//
//        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 10);
//        webDriverWait.until(ExpectedConditions.attributeContains(By.id("dynamicColour"), "style", "color: red;"));
//        assertTrue(changeColor.getAttribute("style").contains("color: red;"));
//    }
//
//
//}
//
