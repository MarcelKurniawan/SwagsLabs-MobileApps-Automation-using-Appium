package MobileAutomation.StepDefinition;

import MobileAutomation.BaseTest;
import MobileAutomation.Page.HomePage;
import MobileAutomation.Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.inputPassword(password);
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickLogin();
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage.validateOnPage();
    }

    @Then("user is able to see error message")
    public void displayErrorMessage() {
        loginPage.validateErrorMessage();
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage.validateOnPage();
    }
}
