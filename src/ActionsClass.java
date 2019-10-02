import Browsers.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClass {
    public static void main(String[] args) {
        WebDriver driver=ChromeWebDriver.getChrome();
        driver.get("https://www.amazon.com");
        WebDriverWait wait =new WebDriverWait(driver,5);
        driver.manage().window().maximize();
        Actions a =new Actions(driver);

        a.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).build().perform();
        a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("car").doubleClick().build().perform();
        //a.moveToElement(driver.findElement(By.cssSelector("input[value='Go']"))).click().build().perform();
        a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).contextClick().build().perform();

    }
}
