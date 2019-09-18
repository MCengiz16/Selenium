import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\workplace\\webdrivers\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.google.com");
        System.out.println("title of the page: "+chrome.getTitle());
        chrome.navigate().to("https://www.facebook.com");
        System.out.println("Title of the page: "+chrome.getTitle());
        chrome.navigate().back();
        System.out.println("Title of the page: "+chrome.getTitle());
        chrome.navigate().forward();
        System.out.println("Title of the page: "+chrome.getTitle());
        System.out.println("**********************************************************************************");
        //System.out.println(chrome.getPageSource());
        chrome.quit();

    }
}
