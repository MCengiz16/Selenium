package Browsers;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {public static void main(String[] args) throws MalformedURLException {
    DesiredCapabilities ch = DesiredCapabilities.chrome();

    //ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
   // ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
    ch.setBrowserName("Chrome");
    ch.setPlatform(Platform.WINDOWS);
    //ch.setVersion("9");



    WebDriver driver = new RemoteWebDriver(new URL("http://10.10.50.71:2000/wd/hub"),ch);
            driver.get("https://www.google.com");



}


   // public static WebDriver getRemoteChrome() {


        //SSL and insecure Certificates
//        DesiredCapabilities ch = DesiredCapabilities.chrome();
//
//        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
//        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
//        ch.setBrowserName("Chrome");
//        ch.setPlatform(Platform.WINDOWS);
//        //ch.setVersion("9");
//
//
//
//        WebDriver driver = new RemoteWebDriver(new URL("http://10.10.50.71:2000/wd/hub")
//        driver.get("https://www.google.com");
//
//        return driver;
    }

