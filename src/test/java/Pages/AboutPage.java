package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AboutPage {
    //Products Page Object Model
    WebDriver driver = null;
    //Page element identifiers
    static By saucelabs_image = By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/div[1]/a/div[1]/span/img");

    //Webdriver constructor
    public AboutPage(WebDriver driver) {

       this.driver = driver;
    }

    // Assert that page has loaded successfully
    public void waitAboutPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/div[1]/a/div[1]/span/img")));

    }
    // Assert that page has loaded successfully
    public void assertAboutPageHasLoaded() {
        assertTrue(driver.findElement(saucelabs_image).isDisplayed());
    }

}
