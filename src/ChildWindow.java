import Browsers.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ChildWindow {
    public static void main(String[] args) {
        WebDriver driver= ChromeWebDriver.getChrome();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        Actions a =new Actions(driver);


        a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("car").doubleClick().build().perform();
        a.moveToElement(driver.findElement(By.cssSelector("input[value='Go']"))).click().build().perform();
        System.out.println(driver.getTitle());

        driver.getWindowHandles();
        Set<String> ids=driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        String parentId=it.next();
        String ChildId=it.next();
        driver.switchTo().window(ChildId);

        System.out.println(driver.getTitle());

        driver.switchTo().window(parentId);

        System.out.println(driver.getTitle());




    }
}
