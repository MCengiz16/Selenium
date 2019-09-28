package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaWebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver", "C:\\Workplace\\webdrivers\\operadriver_win32\\operadriver.exe");
        WebDriver Opera = new OperaDriver();
        Opera.get("https://www.google.com/");
    }
   /*public static WebDriver Opera()  {
        System.setProperty("webdriver.opera.driver", "C:\\workplace\\webdrivers\\operadriver.exe");
        WebDriver Opera = new OperaDriver();
        return Opera;

    }*/


}
