import com.andersenlab.ChangeAddressPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ChangeAddressTest {
    WebDriver driver;

    @Step("Start")
    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromedriver().create();
        driver.get("http://automationpractice.com/index.php");
    }

    @Step("Stop")
    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @Description("Change address test")
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
