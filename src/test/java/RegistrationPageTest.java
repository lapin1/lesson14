import com.andersenlab.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {
    WebDriver driver;

    @Step("Start")
    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box/way2auto_jquery/registration.php");
    }

    @Step("Stop")
    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @Description("Successful registration")
    public void successfulRegistration() {
        new RegistrationPage(driver)
                .fillFirstname("Yauheni")
                .fillLastName("Lapin")
                .selectStatus()
                .selectHobby()
                .selectCountry()
                .selectDay()
                .selectMonth()
                .selectYear()
                .fillPhone("34868436436")
                .fillUserName("yauheni11")
                .fillEmail("email1234@gmail.com")
                .fillTextArea("some text")
                .fillPassword("superPass123")
                .confirmPassword("superPass123")
                .clickSubmit();
    }

    @Test
    @Description("Unsuccessful registration")
    public void unsuccessfulRegistration() {
        new RegistrationPage(driver)
                .fillFirstname("Yauheni")
                .selectStatus()
                .selectDay()
                .fillUserName("yauheni11")
                .fillPassword("superPass123")
                .confirmPassword("superPass123")
                .clickSubmit();
    }


}
