import com.andersenlab.ChangeInformationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ChangeInformationTest {
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromedriver().create();
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    public void changeInformation() {
        String text = "Your personal information has been successfully updated.";
        new ChangeInformationPage(driver)
                .clickInfoButton()
                .fillEmail("lapinzh358@gmail.com")
                .fillPassword("superPass11")
                .clickSignInButton()
                .clickSelectButton()
                .editFirstName("yauhen")
                .editLastName("lapin")
                .editEmail("lapinzh358@gmail.com")
                .editPassword("superPass11", "superPass11")
                .clickConfirmationButton();

    }
}
