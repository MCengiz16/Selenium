package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeWebDriver {
    public static void main(String[] args) {

    }


    public static WebDriver getChrome() {


        //SSL and insecure Certificates
        DesiredCapabilities ch = DesiredCapabilities.chrome();

        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);


        ChromeOptions c = new ChromeOptions();
        c.merge(ch);

        System.setProperty("webdriver.chrome.driver", "C:\\workplace\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(c);


        return driver;
    }
}
