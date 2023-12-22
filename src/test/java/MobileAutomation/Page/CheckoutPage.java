package MobileAutomation.Page;

import MobileAutomation.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage extends BaseTest{

    By item2 = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]");
    By item1 = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[2]");
    By cartButton = AppiumBy.accessibilityId("test-Cart");
    By checkoutButton = AppiumBy.accessibilityId("test-CHECKOUT");
    By firstName = AppiumBy.accessibilityId("test-First Name");
    By lastName = AppiumBy.accessibilityId("test-Last Name");
    By zipCode = AppiumBy.accessibilityId("test-Zip/Postal Code");
    By contButton = AppiumBy.accessibilityId("test-CONTINUE");
    By finishButton = AppiumBy.accessibilityId("test-FINISH");
    By backHomeButton = AppiumBy.accessibilityId("test-BACK HOME");

    public void addToCart(){
        driver.findElement(item1).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("test-Cart")));
        driver.findElement(item2).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("test-Cart")));
    }

    public void goToCart(){
        driver.findElement(cartButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")));
    }

    public void swipeToElementWithText(String text) {
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))",
                                text)));

    }

    public void processToCheckout(){
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"CHECKOUT\"))")));
        driver.findElement(checkoutButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("test-First Name")));
    }

    public void fillCheckoutInfo(String fName, String lName, String postalCode) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(zipCode).sendKeys(postalCode);
        driver.findElement(contButton).click();
    }

    public void finishCheckout(){
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"FINISH\"))")));
        driver.findElement(finishButton).click();

    }

    public void validateSuccess(){
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("test-BACK HOME")));
    }

}
