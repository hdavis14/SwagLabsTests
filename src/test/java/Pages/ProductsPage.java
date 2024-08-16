package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

public class ProductsPage {
    //Products Page Object Model
    WebDriver driver = null;
    //Page element identifiers
    static By btshirt_link = By.xpath("//*[contains(@id, 'item_1_title_link')]");

    //Webdriver constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
  }

    //Wait for page to load
    public void waitProductsPage() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'btn_primary btn_inventory')]")));
     }
    // Assert that page has loaded successfully
     public void assertProductsPageHasLoaded() {
        assertTrue(driver.findElement(btshirt_link).isDisplayed());
     }
     //Page actions
     public void clickBtshirtLink(){
        driver.findElement(btshirt_link).click();
     }





}

