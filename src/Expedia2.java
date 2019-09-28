import Browsers.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Expedia2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeWebDriver myDriver= new ChromeWebDriver();
        WebDriver driver=myDriver.getChrome();
        driver.get("https://www.expedia.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']")).sendKeys("Atlanta");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']")).sendKeys(Keys.ARROW_DOWN );
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']")).sendKeys("Houston");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']")).sendKeys("10/09/2019");
        Thread.sleep(2000);


        driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']")).sendKeys(Keys.CONTROL,"a");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']")).sendKeys("11/09/2019");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='btn-primary btn-action gcw-submit']")).click();






        Thread.sleep(2000);
        driver.quit();

    }
}
