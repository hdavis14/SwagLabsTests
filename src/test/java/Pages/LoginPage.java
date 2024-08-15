package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebElement username_field = null;
    private static WebElement password_field = null;
    private static WebElement login_button = null;

    public static WebElement getUsername_field(WebDriver driver) {
       username_field = driver.findElement(By.id("user-name"));
       return username_field;
    }
    public static WebElement getPassword_field(WebDriver driver) {
        password_field = driver.findElement(By.id("password"));
        return password_field;
    }
     public static WebElement getLogin_button(WebDriver driver) {
        login_button = driver.findElement(By.id("login-button"));
        return login_button;
     }
}
