import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\workplace\\webdrivers\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.facebook.com");

        chrome.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
    }
}
