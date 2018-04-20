package org.opi.tests.page.objects;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private Logger logger = LogManager.getLogger(HomePage.class);

    @FindBy(id = "search_query_top")
    private WebElement searchQueryTextField;

    @FindBy(name = "submit_search")
    private WebElement searchButton;

    @FindBy(className = "login")
    private WebElement signINLink;

    @Step("Typed into search query field")
    public HomePage typeIntoSearchQueryTextField(String searchQuery) {
        searchQueryTextField.sendKeys(searchQuery);
        logger.info("Typed into search query field{}", searchQuery);
        return this;
    }

    @Step("Clicked on search button")
    public ResultsPage searchButtonAndClick() {
        searchButton.click();
        return new ResultsPage();

    }

    public LoginPage clickOnSignIn() {
        signINLink.click();
        return new LoginPage();
    }

}
