import Browsers.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TableValues {
    public static void main(String[] args) {
        WebDriver driver = ChromeWebDriver.getChrome();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22743/ind-vs-rsa-1st-test-south-africa-tour-of-india-2019");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rowCount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
        int i;
        int sum=0;
        String value;
        String extra;
        String total;
        for(i=0;i<rowCount-3;i++) {
            value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            System.out.println(value);
            int valueInt= Integer.parseInt(value);
           sum=sum+ valueInt;
        }
        extra= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(2)")).get(i).getText();
        System.out.println("extra :"+extra);
        int extraInt=Integer.parseInt(extra);
        sum=sum+ extraInt;
        total= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(2)")).get(i+1).getText();
        System.out.println("Total :"+total);
        int totalInt=Integer.parseInt(total);

        if(totalInt==sum){
            System.out.println("Correct");
        }
        else{
            System.out.println("Failed");
        }

    }
}
