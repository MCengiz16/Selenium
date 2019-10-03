import Browsers.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropFrameSwitch {
    public static void main(String[] args) {
        WebDriver driver= ChromeWebDriver.getChrome();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

        Actions a =new Actions(driver);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source,target).build().perform();

        driver.switchTo().defaultContent();

    }

}
