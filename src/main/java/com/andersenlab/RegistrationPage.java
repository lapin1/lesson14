package com.andersenlab;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {

    private final WebDriver driver;

    private final By firstName = By.name("name");
    private final By lastName = By.cssSelector("p:nth-child(2) > input");
    private final By status = By.name("m_status");
    private final By hobby = By.name("hobby");
    private final By phone = By.name("phone");
    private final By country = By.cssSelector("fieldset:nth-child(4) > select");
    private final By day = By.cssSelector(".time_feild:nth-child(2) > select");
    private final By month = By.cssSelector(".time_feild:nth-child(3) > select");
    private final By year = By.cssSelector(".time_feild:nth-child(4) > select");
    private final By userName = By.name("username");
    private final By email = By.name("email");
    private final By textArea = By.cssSelector("textarea");
    private final By password1 = By.name("password");
    private final By password2 = By.name("c_password");
    private final By submit = By.cssSelector("fieldset:nth-child(13) > input");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Fill first name field")
    public RegistrationPage fillFirstname(String data) {
        driver.findElement(firstName).click();
        driver.findElement(firstName).sendKeys(data);
        return this;

    }

    @Step("Fill last name field")
    public RegistrationPage fillLastName(String data) {
        driver.findElement(lastName).click();
        driver.findElement(lastName).sendKeys(data);
        return this;
    }


    @Step("Select hobby")
    public RegistrationPage selectHobby() {
        driver.findElement(hobby).click();
        return this;
    }

    @Step("Select status")
    public RegistrationPage selectStatus() {
        driver.findElement(status).click();
        return this;
    }

    @Step("Select country")
    public RegistrationPage selectCountry() {
        driver.findElement(country).click();
        {
            WebElement dropdown = driver.findElement(country);
            dropdown.findElement(By.xpath("//option[. = 'India']")).click();
        }
        return this;
    }

    @Step("Select birthday day")
    public RegistrationPage selectDay() {
        driver.findElement(day).click();
        {
            WebElement dropdown = driver.findElement(day);
            dropdown.findElement(By.xpath("//option[. = '1']")).click();
        }
        return this;
    }

    @Step("Select birthday month")
    public RegistrationPage selectMonth() {
        driver.findElement(month).click();
        {
            WebElement dropdown = driver.findElement(month);
            dropdown.findElement(By.xpath("//option[. = '1']")).click();
        }
        return this;
    }

    @Step("Select birthday year")
    public RegistrationPage selectYear() {
        driver.findElement(year).click();
        {
            WebElement dropdown = driver.findElement(year);
            dropdown.findElement(By.xpath("//option[. = '2014']")).click();
        }
        return this;
    }

    @Step("Fill phone field")
    public RegistrationPage fillPhone(String data) {
        driver.findElement(phone).click();
        driver.findElement(phone).sendKeys(data);
        return this;

    }

    @Step("Fill username field")
    public RegistrationPage fillUserName(String data) {
        driver.findElement(userName).click();
        driver.findElement(userName).sendKeys(data);
        return this;

    }

    @Step("Fill email field")
    public RegistrationPage fillEmail(String data) {
        driver.findElement(email).click();
        driver.findElement(email).sendKeys(data);
        return this;

    }

    public RegistrationPage fillTextArea(String data) {
        driver.findElement(textArea).click();
        driver.findElement(textArea).sendKeys(data);
        return this;

    }

    @Step("Fill password field")
    public RegistrationPage fillPassword(String data) {
        driver.findElement(password1).click();
        driver.findElement(password1).sendKeys(data);
        return this;
    }

    @Step("Confirm password")
    public RegistrationPage confirmPassword(String data) {
        driver.findElement(password2).click();
        driver.findElement(password2).sendKeys(data);
        return this;
    }

    @Step("Finish registration")
    public void clickSubmit() {
        WebElement element = driver.findElement(submit);
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
