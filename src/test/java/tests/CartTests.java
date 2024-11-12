package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.CartPage;

public class CartTests {
    WebDriver driver;
    LoginPage loginPage;
    CartPage cartPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        cartPage = new CartPage(driver);
    }

    @Test
    public void testAddItemToCart() {
        cartPage.addItemToCart();
        Assert.assertFalse(cartPage.isCartEmpty());
    }

    @Test
    public void testRemoveItemFromCart() {
        cartPage.addItemToCart();
        cartPage.goToCart();
        cartPage.removeItemFromCart();
        Assert.assertTrue(cartPage.isCartEmpty());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

