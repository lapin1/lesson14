import com.andersenlab.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box/way2auto_jquery/registration.php");
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
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
