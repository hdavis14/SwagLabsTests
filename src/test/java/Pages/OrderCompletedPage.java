package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderCompletedPage {
    WebDriver driver = null;

    static By order_complete = By.xpath("//*[contains(@id,'checkout_complete_container')]");

    public OrderCompletedPage(WebDriver driver) {

        this.driver = driver;
    }

    public void waitOrderCompletedPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'checkout_complete_container')]")));

    }
    public void assertOrderCompletedPageHasLoaded() {

        assertTrue(driver.findElement(order_complete).isDisplayed());
    }

}
