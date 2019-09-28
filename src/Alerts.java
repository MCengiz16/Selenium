import Browsers.ChromeWebDriver;
import org.openqa.selenium.WebDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        ChromeWebDriver myDriver= new ChromeWebDriver();
        WebDriver driver=myDriver.getChrome();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
}
