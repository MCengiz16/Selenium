import Browsers.ChromeWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxesAndSize {
    public static void main(String[] args) {
        WebDriver driver= ChromeWebDriver.getChrome();
        driver.get("https://www.amazon.com");

    }
}
