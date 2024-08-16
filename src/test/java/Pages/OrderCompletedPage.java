package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderCompletedPage {
    //Order Completed Page Object Model
    WebDriver driver = null;
    //Page element identifiers
    static By order_complete = By.xpath("//*[contains(@id,'checkout_complete_container')]");

    //Webdriver constructor
    public OrderCompletedPage(WebDriver driver) {

        this.driver = driver;
    }

    //Wait for page to load
    public void waitOrderCompletedPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'checkout_complete_container')]")));

    }
    // Assert that page has loaded successfully
    public void assertOrderCompletedPageHasLoaded() {

        assertTrue(driver.findElement(order_complete).isDisplayed());
    }

}
