package org.opi.tests.tests;

import org.opi.tests.page.objects.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests extends TestBase {

    @DataProvider(name = "myLocalDataProvider")
    public Object[][] articlesToSearch() {
        Object[][] testDataArray = {{"Faded Short Sleeve T-shirts"}, {"Blouse"}};
        return testDataArray;
    }

    @Test(dataProvider = "myLocalDataProvider")
    public void asUserSearchForTshirt(String articleName) {

        HomePage homePage = new HomePage();
        homePage
                .typeIntoSearchQueryTextField(articleName)
                .searchButtonAndClick()
                .assertThatProductWithNameIsDisplayed(articleName);
//        org.opi.tests.page.objects.ResultsPage resultsPage = new org.opi.tests.page.objects.ResultsPage();
//        assertTrue(resultsPage.elementIsDisplayed());
//        assertEquals(resultsPage.getTextOnPage(),"Faded Short Sleeve T-shirts");


        //WebElement productLabel = webDriver.findElement(By.cssSelector("div[class='product-container'] [class = 'product-name']"));


//        assertTrue(productLabel.isDisplayed());
//        assertEquals(productLabel.getText(),"Faded Short Sleeve T-shirts");

    }


//    @Test
//    public void asUserSearchForBlouse() {
//
//        HomePage homePage = new HomePage();
//        homePage
//                .typeIntoSearchQueryTextField("Blouse")
//                .searchButtonAndClick()
//                .assertThatProductWithNameIsDisplayed("Blouse");
//        org.opi.tests.page.objects.ResultsPage resultsPage = new org.opi.tests.page.objects.ResultsPage();
//        assertTrue(resultsPage.elementIsDisplayed());
//        assertEquals(resultsPage.getTextOnPage(),"Blouse");
//
//    }


}
