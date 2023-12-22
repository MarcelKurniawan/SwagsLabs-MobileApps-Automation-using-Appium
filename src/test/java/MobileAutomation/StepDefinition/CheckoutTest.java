package MobileAutomation.StepDefinition;

import MobileAutomation.Page.CheckoutPage;
import MobileAutomation.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutTest extends BaseTest {
    CheckoutPage checkoutPage = new CheckoutPage();


    @When("user add two items to the cart")
    public void userAddTwoItemsToTheCart() {
        checkoutPage.addToCart();
    }

    @And("user click on cart button")
    public void userClickOnCartButton() {
        checkoutPage.goToCart();
    }

    @And("user click on checkout button")
    public void userClickOnCheckoutButton() {
        checkoutPage.processToCheckout();
    }

    @And("user fills out the form with {string}, {string}, {string}")
    public void userFillsOutForm(String firstName, String lastName, String zipCode) {
        checkoutPage.fillCheckoutInfo(firstName, lastName, zipCode);
    }


    @And("user click on finish button")
    public void userClickOnFinishButton() {
        checkoutPage.finishCheckout();
    }

    @Then("user is on checkout success page")
    public void userCheckoutSuccess() {
        checkoutPage.validateSuccess();
    }

}