package StepDefinitions;

import Pages.ProductsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pages.LoginPage;
import Pages.ProductsPage;
import Pages.ProductItemPage;
import Pages.ShoppingCartPage;
import Pages.YourInformationPage;
import Pages.OverviewPage;
import Pages.OrderCompletedPage;
import Pages.AboutPage;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SauceLabsCucumber {
    //Build base url
    private static String address = "www.saucedemo.com/v1/";
    private static String baseUrl = String.format("http://%s", address);
    static WebDriver driver;
    ProductsPage productsPage = new ProductsPage(driver);

    // Wait for object to be used to allow time for pages to load
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user is on login page");
        //Launch sauce demo URL
        driver.get(baseUrl + "index.html");

        //Maximize screen and close driver and page after 10 seconds if there is an issue
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }
    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_username_and_password(String username, String password) {
        System.out.println("user enters username and password");
        // Login with credentials
        LoginPage.getUsername_field(driver).sendKeys(username);
        LoginPage.getPassword_field(driver).sendKeys(password);

    }
    @And("clicks on the login button")
    public void clicks_on_the_login_button() {
        System.out.println("clicks on the login button");
        //Click the login button
        LoginPage.getLogin_button(driver).click();
    }

    @And("login with no credentials")
    public void login_with_no_credentials() {
        System.out.println("clicks on the login button");
        //Click the login button
        LoginPage.getLogin_button(driver).click();
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id='login_button_container']/div"));

        String textToRetrieve = errorMessage.getAttribute("innerText");
        System.out.println(textToRetrieve);
//        String actualError = errorMessage.getAttribute("text");
//        String expectedError = "Invalid username or password";
//        assertEquals(actualError, expectedError);
    }

    @And("user is navigated to the home page and selects a product")
    public void user_is_navigated_to_the_home_page_selects_a_product() {
        System.out.println("user is navigated to the home page and selects a product");
        ProductsPage productsPage = new ProductsPage(driver);
        // Wait for object to be used to allow time for pages to load
        productsPage.waitProductsPage();
        //Assert that product page has loaded
        productsPage.assertProductsPageHasLoaded();
        //Click Black Tshirt link
        productsPage.clickBtshirtLink();

    }

    @And("user adds product to shopping cart")
    public void user_adds_product_to_shopping_cart() {
        System.out.println("user selects a product");
        //Select product and add to basket
        ProductItemPage productItemPage = new ProductItemPage(driver);
        // Wait for object to be used to allow time for pages to load
        productItemPage.waitProductItemPage();
        //Assertion on the product page
        productItemPage.assertProductItemPageHasLoaded();
        // Click Add to Cart button
        productItemPage.clickAddToCartButton();
        //Navigate to the shopping cart and checkout
        productItemPage.clickShopCartLink();

    }

    @And("user navigates to shopping cart and checkout")
    public void user_navigates_to_shopping_cart_and_checkout() {
        System.out.println("user navigates to shopping cart and checkout");
        //Click on shopping cart link
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
         // Wait for shopping cart page to load
        shoppingCartPage.waitShoppingCartPage();
        //Assert that shopping cart has loaded
        shoppingCartPage.assertShoppingCartPageHasLoaded();
        //Click on Checkout button
        shoppingCartPage.clickCheckoutButton();
    }

    @And("user navigates to shopping cart")
    public void user_navigates_to_shopping_cart() {
        System.out.println("user navigates to shopping cart and checkout");
        //Click on shopping cart link
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        // Wait for shopping cart page to load
        shoppingCartPage.waitShoppingCartPage();
        //Assert that shopping cart has loaded
        shoppingCartPage.assertShoppingCartPageHasLoaded();
    }
    @And("^user enters (.*), (.*) and (.*) then clicks continue$")
    public void user_enters_firstname_lastname_and_postcode (String firstname, String lastname, String postcode) {
        System.out.println("user enters customer information");

        YourInformationPage yourInformationPage = new YourInformationPage(driver);
        // Wait for shopping cart page to load
        yourInformationPage.waitShoppingCartPage();
        //Assert that shopping cart has loaded
        yourInformationPage.assertShoppingCartPageHasLoaded();
        //Enter Your Information and Click Continue
        yourInformationPage.enterFirstName(firstname);
        yourInformationPage.enterLastName(lastname);
        yourInformationPage.enterPostCode(postcode);
        //Click continue
        yourInformationPage.clickContinueButton();
    }

    @Then("user is navigated to the overview page and clicks finish")
    public void user_navigates_to_the_overview_page_and_clicks_finish() {
        System.out.println("user is navigated to the overview page and clicks finish");
        //Review Overview page and click finish
        OverviewPage overviewPage = new OverviewPage(driver);
        // Wait for overview page to load
        overviewPage.waitOverviewPage();
        //Assert that overview page has loaded
        overviewPage.assertOverviewPageHasLoaded();
        //Click Finish Button
        overviewPage.clickFinishButton();
    }
    @Then("user removes product from the shopping cart")
    public void user_removes_item_from_shopping_cart() {
        System.out.println("user removes product from the shopping cart");
        //Remove product
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
         //wait for shopping cart to load
        shoppingCartPage.waitShoppingCartPage();
        //Remove item from shopping cart
        shoppingCartPage.clickRemoveButton();

    }
    @And("user selects about link")
    public void user_selects_about_link() {
        System.out.println("user selects about link");
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //Click side menu
        shoppingCartPage.clickMenuButton();
        //Selects about link
        shoppingCartPage.clickAboutLink();

    }
    @And("user is on the about page")
    public void user_is_on_the_about_page() {
        System.out.println("user selects about link");
        AboutPage aboutPage = new AboutPage(driver);
        //On about page
        aboutPage.waitAboutPage();
        //Assert about page
        aboutPage.assertAboutPageHasLoaded();
        driver.close();
    }

    @And("user logs out")
    public void user_logs_out() {
        System.out.println("user logs out");
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //Click side menu
        shoppingCartPage.clickMenuButton();
        //Logout
        shoppingCartPage.clickLogoutLink();
        driver.close();
    }

    @And("user completes order")
    public void user_completes_order() {
         System.out.println("user completes order");
        //Order Completed
        OrderCompletedPage orderCompletedPage = new OrderCompletedPage(driver);
        // Wait for order completed page to load
        orderCompletedPage.waitOrderCompletedPage();
        //Assert that order completed page has loaded
        orderCompletedPage.assertOrderCompletedPageHasLoaded();
        driver.close();

        }

    @After
    public void teardown() {

        driver.quit();
    }
}
