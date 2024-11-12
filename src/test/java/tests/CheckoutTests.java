package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutTests {
    WebDriver driver;
    LoginPage loginPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        cartPage = new CartPage(driver);
        cartPage.addItemToCart();
        cartPage.goToCart();

        checkoutPage = new CheckoutPage(driver);
    }

    @Test
    public void testCheckoutProcess() {
        checkoutPage.checkout("Mohamed", "Khaled", "12345");
        Assert.assertTrue(checkoutPage.isOrderSuccessful());
    }

    @Test
    public void testCheckoutEmptyField() {
        checkoutPage.checkoutEmptyField();
        Assert.assertTrue(checkoutPage.isErrorMessageDisplayedWithEmptyField());
    }

    @Test
    public void testCheckoutCancellation() {
        checkoutPage.checkoutCancellation();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
