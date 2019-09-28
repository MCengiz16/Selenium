import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckUrl {
    public static void main(String[] args) {
        String sentUrl = "https://www.google.com/";
        String currentUrl= Firefox(sentUrl);
        boolean match = sentUrl.equals(currentUrl);

        System.out.println("Sent Url: " + sentUrl +
                "\n" + "Current Url: " + currentUrl +
                "\n" + "Match: " + match);
    }

    public static String Firefox(String url) {

        System.setProperty("webdriver.gecko.driver", "C:\\workplace\\webdrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }


}
