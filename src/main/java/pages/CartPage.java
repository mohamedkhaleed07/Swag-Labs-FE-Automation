package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    public void goToCart() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    public void removeItemFromCart() {
        driver.findElement(By.cssSelector(".cart_button")).click();
    }

    public boolean isCartEmpty() {
        return driver.findElements(By.className("shopping_cart_badge")).isEmpty();
    }
}
