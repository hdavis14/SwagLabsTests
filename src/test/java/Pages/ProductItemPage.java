package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductItemPage {
    //Products Item Page Object Model
    WebDriver driver = null;
    //Page element identifiers
    static By add_to_cart_button = By.xpath("//*[contains(@class, 'btn_primary btn_inventory')]");
    static By shop_cart_link = By.id("shopping_cart_container");

    //Webdriver constructor
    public ProductItemPage(WebDriver driver) {
        this.driver = driver;
    }

    //Wait for page to load
    public void waitProductItemPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id, 'inventory_item_container')]")));

    }
    // Assert that page has loaded successfully
    public void assertProductItemPageHasLoaded() {
        assertTrue(driver.findElement(add_to_cart_button).isDisplayed());
    }
    //Page Actions
    public void clickAddToCartButton(){
        driver.findElement(add_to_cart_button).click();
    }
    public void clickShopCartLink(){

        driver.findElement(shop_cart_link).click();
    }
}
