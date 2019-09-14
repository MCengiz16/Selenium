import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAndPassword {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\workplace\\webdrivers\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.facebook.com/");
        chrome.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
        chrome.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
        chrome.findElement(By.xpath("//input[@value='Log In']")).click();
        chrome.close();


    }
}
