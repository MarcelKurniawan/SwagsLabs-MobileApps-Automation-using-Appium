package MobileAutomation.Page;

import MobileAutomation.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BaseTest {

    By loginTextBox = AppiumBy.accessibilityId("test-Username");
    By passwordTextBox = AppiumBy.accessibilityId("test-Password");
    By loginButton = AppiumBy.accessibilityId("test-LOGIN");

    public void validateOnPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(loginTextBox));
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordTextBox));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
    }

    public void inputUsername(String username) {
        driver.findElement(loginTextBox).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void validateErrorMessage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("test-Error message")));
    }

}
