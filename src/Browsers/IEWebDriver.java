package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEWebDriver {
    public static void main(String[] args) {
        IEWebDriver.getIE();

    }

    public static void getIE()  {
        System.setProperty("webdriver.ie.driver", "C:\\workplace\\webdrivers\\IEDriverServer.exe");
        WebDriver ie = new InternetExplorerDriver();
        ie.get("https://www.google.com");

        System.out.println(ie.getTitle());
        System.out.println(ie.getCurrentUrl());
        ie.close();
    }
}
