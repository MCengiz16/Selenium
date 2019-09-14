package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriver {
    public static void main(String[] args) {
        FirefoxWebDriver.getFirefox();
    }


    public static void getFirefox() {

        System.setProperty("webdriver.gecko.driver", "C:\\workplace\\webdrivers\\geckodriver.exe");
        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://www.google.com");
        System.out.println(firefox.getTitle());
        System.out.println(firefox.getCurrentUrl());
        firefox.quit();


    }
}