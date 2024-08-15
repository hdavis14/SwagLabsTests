package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCartPage {
    //Shopping cart Page Object Model
    WebDriver driver = null;
    //Page element identifiers
    static By checkout_button = By.xpath("//*[contains(@class, 'btn_action checkout_button')]");
    static By remove_button = By.xpath("//*[contains(@class, 'btn_secondary cart_button')]");
    static By continue_shopping_button = By.id("shopping_cart_container");
    static By menu_button = By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
    static By logout_link = By.id("logout_sidebar_link");
    static By about_link = By.id("about_sidebar_link");

    //Webdriver constructor
    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    //Wait for page to load
    public void waitShoppingCartPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'btn_action checkout_button')]")));

       }
    // Page actions
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
    public void clickMenuButton(){
        driver.findElement(menu_button).click();
       }
    public void clickAboutLink(){
           driver.findElement(about_link).click();
        }
        public void clickLogoutLink(){
            driver.findElement(logout_link).click();
        }
}
