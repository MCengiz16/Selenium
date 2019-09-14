package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriver {
    public static void main(String[] args) {
        ChromeWebDriver.getChrome();
    }


    public static void getChrome() {

        System.setProperty("webdriver.chrome.driver", "C:\\workplace\\webdrivers\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.google.com");

        System.out.println(chrome.getTitle());

        System.out.println(chrome.getCurrentUrl());

        chrome.close();


    }
}
