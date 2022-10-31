package com.andersenlab;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPurchasePage {

    private final WebDriver driver;

    private final By womenButton = By.linkText("Women");
    private final By imageOfProduct = By.cssSelector(".product_img_link > .replace-2x");
    private final By color = By.id("color_14");
    private final By size = By.cssSelector(".exclusive > span");
    private final By email = By.id("email");
    private final By password = By.id("passwd");
    private final By loginForm = By.id("login_form");
    private final By submitButton = By.cssSelector("#SubmitLogin > span");

    private final By checkoutForm1 = By.cssSelector(".button:nth-child(4) > span");
    private final By checkoutForm2 = By.id("cgv");
    private final By checkoutButton = By.cssSelector(".standard-checkout > span");
    private final By paymentOptionButton = By.linkText("Pay by bank wire (order processing will be longer)");
    private final By confirmationButton = By.cssSelector("#cart_navigation span");

    public ProductPurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPurchasePage selectProduct() {
        driver.findElement(womenButton).click();
        driver.findElement(imageOfProduct).click();
        return this;
    }

    public ProductPurchasePage selectColor() {
        driver.findElement(color).click();
        return this;
    }

    public ProductPurchasePage selectSize() {
        driver.findElement(size).click();
        return this;
    }

    public ProductPurchasePage fillEmail(String emailData) {
        driver.findElement(email).click();
        driver.findElement(email).sendKeys(emailData);
        return this;
    }

    public ProductPurchasePage fillPassword(String passwordData) {
        driver.findElement(password).click();
        driver.findElement(password).sendKeys(passwordData);
        return this;
    }

    public ProductPurchasePage clickSignInButton() {
        driver.findElement(loginForm).click();
        driver.findElement(submitButton).click();
        return this;
    }

    public ProductPurchasePage clickCheckoutButton() {
        driver.findElement(checkoutForm1).click();
        driver.findElement(checkoutForm2).click();
        driver.findElement(checkoutButton).click();
        return this;
    }

    public ProductPurchasePage selectPaymentOption() {
        driver.findElement(paymentOptionButton).click();
        return this;
    }

    public void clickConfirmationButton() {
        WebElement element = driver.findElement(confirmationButton);
        Assertions.assertTrue(isClicked(element));
    }

    public boolean isClicked(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
