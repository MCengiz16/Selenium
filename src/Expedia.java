import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expedia {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\workplace\\webdrivers\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.expedia.com");
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-origin-hp-package']")).click();
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys("H");
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        chrome.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys("i");
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);


        chrome.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-departing-hp-package']")).sendKeys("10/10/2019");
        Thread.sleep(1000);

        chrome.findElement(By.xpath("//input[@id='package-returning-hp-package']")).click();
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-returning-hp-package']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-returning-hp-package']")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//input[@id='package-returning-hp-package']")).sendKeys("10/20/2019");
        Thread.sleep(1000);

        chrome.findElement(By.xpath("//div[@id='traveler-selector-hp-package']/div/ul/li/button")).click();
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//div[@id='traveler-selector-hp-package']/div/ul/li/div/div/div[1]/div[2]/div[2]")).click();
        Thread.sleep(1000);

        chrome.findElement(By.xpath("//button[@id='search-button-hp-package']")).click();





    }
}
