package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

public class ProductsPage {

    WebDriver driver = null;

    static By btshirt_link = By.xpath("//*[contains(@id, 'item_1_title_link')]");
    static By shop_cart_link = By.id("shopping_cart_container");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
  }

 public void waitProductsPage() {
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'btn_primary btn_inventory')]")));

 }
  public void assertProductsPageHasLoaded() {
        assertTrue(driver.findElement(btshirt_link).isDisplayed());
  }

  public void clickBtshirtLink(){
        driver.findElement(btshirt_link).click();
    }

}
