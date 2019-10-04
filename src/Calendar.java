import Browsers.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    public static void main(String[] args) {
        String calendarMonth="March";
        String calendarDay= "4";
        WebDriver driver = ChromeWebDriver.getChrome();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input#travel_date")).click();

        while ( !driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains(calendarMonth) ){

            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }



        List<WebElement> dates= driver.findElements(By.className("day"));


        for(int i=0;i<dates.size();i++){
            String text =driver.findElements(By.className("day")).get(i).getText();
            if(text.equalsIgnoreCase(calendarDay)){
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }



    }
}
