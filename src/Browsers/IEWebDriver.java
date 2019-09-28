package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEWebDriver {
    public static void main(String[] args) {


    }

    public static WebDriver getIE()  {
        System.setProperty("webdriver.ie.driver", "C:\\workplace\\webdrivers\\IEDriverServer.exe");
        WebDriver ie = new InternetExplorerDriver();
        return ie;

    }
}
