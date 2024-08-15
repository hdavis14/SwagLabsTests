package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class YourInformationPage {

    WebDriver driver = null;

    static By first_name_field = By.id("first-name");
    static By last_name_field = By.id("last-name");
    static By post_code_field = By.id("postal-code");
    static By yi_continue_button = By.xpath("//*[contains(@class, 'btn_primary cart_button')]");
    static By cancel_button = By.xpath("//*[contains(@class, 'cart_cancel_link btn_secondary')]");

    public YourInformationPage(WebDriver driver) {
        this.driver = driver;

    }
    public void waitShoppingCartPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'btn_primary cart_button')]")));

    }
    public void assertShoppingCartPageHasLoaded() {
        assertTrue(driver.findElement(yi_continue_button).isDisplayed());
    }
    public void enterFirstName(String firstName) {
        driver.findElement(first_name_field).sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        driver.findElement(last_name_field).sendKeys(lastName);
    }
    public void enterPostCode(String postCode) {
        driver.findElement(post_code_field).sendKeys(postCode);
    }
    public void clickContinueButton() {
        driver.findElement(yi_continue_button).click();
    }
    public void clickCancelButton() {
        driver.findElement(cancel_button).click();
    }
}
