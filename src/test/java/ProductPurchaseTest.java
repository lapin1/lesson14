import com.andersenlab.ProductPurchasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ProductPurchaseTest {
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
    @Description("Product purchase")
    public void productPurchase() {
        new ProductPurchasePage(driver)
                .selectProduct()
                .selectColor()
                .selectSize()
                .fillEmail("lapinzh358@gmail.com")
                .fillPassword("superPass11")
                .clickSignInButton()
                .clickCheckoutButton()
                .selectPaymentOption()
                .clickConfirmationButton();
    }
}
