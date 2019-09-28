package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriver {
    public static void main(String[] args) {
        FirefoxWebDriver.getFirefox();
    }


    public static WebDriver getFirefox() {

        System.setProperty("webdriver.gecko.driver", "C:\\workplace\\webdrivers\\geckodriver.exe");
        WebDriver firefox = new FirefoxDriver();

        return firefox;


    }
}