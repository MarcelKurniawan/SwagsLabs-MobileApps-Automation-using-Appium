package MobileAutomation.StepDefinition;

import MobileAutomation.BaseTest;
import MobileAutomation.Page.HomePage;
import MobileAutomation.Page.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import static org.junit.Assert.assertTrue;

public class SortTest extends BaseTest {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();

    @And("user click on sort button")
    public void userClickOnSortButton() {
        productPage.clickSort();
    }

    @Then("first item price is smaller than the second item price")
    public void firstItemPriceIsSmallerThanTheSecondItemPrice() {
        assertTrue(productPage.getFirstItemPrice() < productPage.getSecondItemPrice());
    }
}