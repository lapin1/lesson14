package com.andersenlab;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ChangeInformationPage {

    private final WebDriver driver;

    private final By infoButton = By.linkText("My personal info");
    private final By emailField = By.id("email");
    private final By passwordField = By.id("passwd");
    private final By signInButton = By.cssSelector("#SubmitLogin > span");
    private final By selectButton = By.cssSelector("li:nth-child(4) span:nth-child(2)");
    private final By firstName = By.id("firstname");
    private final By lastName = By.id("lastname");
    private final By email = By.id("email");
    private final By oldPassword = By.id("old_passwd");
    private final By newPassword = By.id("passwd");
    private final By confirmedPassword = By.id("confirmation");
    private final By securityInform = By.id("security_informations");
    private final By option = By.id("optin");
    private final By confirmButton = By.cssSelector(".button-medium:nth-child(1) .icon-chevron-right");

    public ChangeInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public ChangeInformationPage clickInfoButton() {
        driver.findElement(infoButton).click();
        return this;
    }

    @Step("Enter email")
    public ChangeInformationPage fillEmail(String emailData) {
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(emailData);
        return this;
    }

    @Step("Enter password")
    public ChangeInformationPage fillPassword(String passwordData) {
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).sendKeys(passwordData);
        return this;
    }

    public ChangeInformationPage clickSignInButton() {
        driver.findElement(signInButton).click();
        return this;
    }

    public ChangeInformationPage clickSelectButton() {
        driver.findElement(selectButton).click();
        return this;
    }

    @Step("Edit first name")
    public ChangeInformationPage editFirstName(String firstNameData) {
        driver.findElement(firstName).click();
        driver.findElement(firstName).sendKeys(firstNameData);
        return this;
    }

    @Step("Edit last name")
    public ChangeInformationPage editLastName(String lastNameData) {
        driver.findElement(lastName).click();
        driver.findElement(lastName).sendKeys(lastNameData);
        return this;
    }

    @Step("Edit email")
    public ChangeInformationPage editEmail(String emailData) {
        driver.findElement(email).click();
        driver.findElement(email).sendKeys(emailData);
        return this;
    }

    @Step("Edit password")
    public ChangeInformationPage editPassword(String oldPasswordData, String newPasswordData) {
        driver.findElement(oldPassword).click();
        driver.findElement(oldPassword).sendKeys(oldPasswordData);
        driver.findElement(newPassword).click();
        driver.findElement(newPassword).sendKeys(oldPasswordData);
        driver.findElement(confirmedPassword).click();
        driver.findElement(confirmedPassword).sendKeys(newPasswordData);
        return this;
    }

    public ChangeInformationPage clickConfirmationButton() {
        driver.findElement(securityInform).click();
        driver.findElement(option).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(confirmButton).click();

        return this;
    }


}
