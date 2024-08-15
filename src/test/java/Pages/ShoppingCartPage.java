package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCartPage {

        WebDriver driver = null;

        static By checkout_button = By.xpath("//*[contains(@class, 'btn_action checkout_button')]");
        static By remove_button = By.xpath("//*[contains(@class, 'cart_contents_container')]");
        static By continue_shopping_button = By.id("shopping_cart_container");

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

        public void waitShoppingCartPage() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'btn_action checkout_button')]")));

        }
        public void assertShoppingCartPageHasLoaded() {
            assertTrue(driver.findElement(checkout_button).isDisplayed());
        }
        public void clickCheckoutButton(){
            driver.findElement(checkout_button).click();
        }
        public void clickRemoveButton(){
            driver.findElement(remove_button).click();
        }
        public void clickContShoppingButton(){
            driver.findElement(continue_shopping_button).click();
        }
}
