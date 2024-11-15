package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkout(String firstName, String lastName, String postalCode) {
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys(firstName);
        driver.findElement(By.id("last-name")).sendKeys(lastName);
        driver.findElement(By.id("postal-code")).sendKeys(postalCode);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
    }

    public void checkoutEmptyField(){
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("continue")).click();
    }

    public void checkoutCancellation(){
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("cancel")).click();
    }

    public boolean isErrorMessageDisplayedWithEmptyField () {
        return driver.findElement(By.cssSelector(".error-message-container")).isDisplayed();
    }

    public boolean isOrderSuccessful() {
        return driver.findElement( By.className("complete-header")).isDisplayed();
    }
}
