import Browsers.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AutoSuggestiveDropdownsJavascriptExecutor {

    public static void main(String[] args)  {
// TODO Auto-generated method stub
        WebDriver driver= ChromeWebDriver.getChrome();

        driver.get("https://www.ksrtc.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");


        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

        System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

//Javascript DOM can extract hidden elements
//because selenium cannot identify hidden elements - (Ajax implementation)
//investigate the properties of object if it have any hidden text

//JavascriptExecutor
        JavascriptExecutor js= (JavascriptExecutor)driver;

        String script = "return document.getElementById(\"fromPlaceName\").value;";
        String text=(String) js.executeScript(script);
        System.out.println(text);
        int i =0;
//BENGALURU INTERNATION AIPORT
        while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPOR"))
        {
            i++;
            driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

            text=(String) js.executeScript(script);
            System.out.println(text);
            if(i>10)
            {
                System.out.println("Element not found");
                break;
            }
            else
            {
                System.out.println("Element  found");
            }

        }
        driver.close();

    }

}