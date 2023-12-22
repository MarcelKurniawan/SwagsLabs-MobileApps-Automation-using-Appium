package MobileAutomation.Page;

import MobileAutomation.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BaseTest {

    By firstItemPrice = AppiumBy.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[1]");
    By secondItemPrice = AppiumBy.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[2]");
    By sortButton = AppiumBy.accessibilityId("test-Modal Selector Button");

    By selectedSort = AppiumBy.xpath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView");

    public void clickSort() {
        driver.findElement(sortButton).click();
        driver.findElement(selectedSort).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("test-Cart")));
    }

    public double getFirstItemPrice() {
        return Double.parseDouble(driver.findElement(firstItemPrice).getText().substring(1));
    }

    public double getSecondItemPrice() {
        return Double.parseDouble(driver.findElement(secondItemPrice).getText().substring(1));
    }
}
