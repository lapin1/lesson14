package com.andersenlab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeAddressPage {
    private final WebDriver driver;

    private final By signInButton = By.linkText("Sign in");
    private final By email = By.id("email");
    private final By password = By.id("passwd");
    private final By submitSignInButton = By.cssSelector("#SubmitLogin > span");
    private final By addressField = By.cssSelector("li:nth-child(3) > a > span:nth-child(2)");
    private final By addressFieldUpdate = By.cssSelector(".address_update > .btn:nth-child(1) > span");
    private final By addressColumn = By.id("center_column");
    private final By address1 = By.id("address1");
    private final By cityField = By.cssSelector(".required:nth-child(5)");
    private final By cityColumn = By.id("center_column");
    private final By city = By.id("city");
    private final By submitButton = By.cssSelector("#submitAddress > span");

    public ChangeAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public ChangeAddressPage clickSignInButton() {
        driver.findElement(signInButton).click();
        return this;
    }

    public ChangeAddressPage fillEmail() {
        driver.findElement(email).click();
        driver.findElement(email).sendKeys("lapinzh358@gmail.com");
        return this;
    }

    public ChangeAddressPage fillPassword() {
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("superPass11");
        return this;
    }

    public ChangeAddressPage clickSubmitSignInButton() {
        driver.findElement(submitSignInButton).click();
        return this;
    }

    public ChangeAddressPage updateAddress() {
        driver.findElement(addressField).click();
        driver.findElement(addressFieldUpdate).click();
        driver.findElement(address1).click();
        driver.findElement(addressColumn).click();
        driver.findElement(address1).sendKeys("85 Albert Bridge Rd12");
        return this;
    }

    public ChangeAddressPage updateCity() {
        driver.findElement(cityField).click();
        driver.findElement(city).click();
        driver.findElement(cityColumn).click();
        driver.findElement(city).sendKeys("London");
        return this;
    }

    public ChangeAddressPage submitEdit() {
        driver.findElement(submitButton).click();
        return this;
    }


}
