package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriver {
    public static void main(String[] args) {

    }


    public static WebDriver getChrome() {

        System.setProperty("webdriver.chrome.driver", "C:\\workplace\\webdrivers\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();



        return chrome;
    }
}
