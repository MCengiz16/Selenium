import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skyscanner {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\workplace\\webdrivers\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.skyscanner.com");
        chrome.findElement(By.xpath("//span[@class='HeaderTab_HeaderTab__text___djus HeaderTab_HeaderTab__text--small__2czAh']")).click();
        chrome.findElement(By.xpath("//input[@type='text']")).sendKeys("Little Rock");
    }
}
