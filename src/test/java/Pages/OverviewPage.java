package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OverviewPage {
    WebDriver driver = null;

    static By finish_button = By.xpath("//*[contains(@class, 'btn_action cart_button')]");
    static By o_cancel_button = By.xpath("//*[contains(@class, 'cart_cancel_link btn_secondary')]");

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitOverviewPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'btn_action cart_button')]")));

    }
    public void assertOverviewPageHasLoaded() {

        assertTrue(driver.findElement(finish_button).isDisplayed());
    }

    public void clickFinishButton() {
        driver.findElement(finish_button).click();
    }

    public void clickOCancelButton() {
        driver.findElement(o_cancel_button).click();
    }
}
