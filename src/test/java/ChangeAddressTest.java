import com.andersenlab.ChangeAddressPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ChangeAddressTest {
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
    public void changeAddress() {
        new ChangeAddressPage(driver)
                .clickSignInButton()
                .fillEmail()
                .fillPassword()
                .clickSubmitSignInButton()
                .updateAddress()
                .updateCity()
                .submitEdit();
    }
}
