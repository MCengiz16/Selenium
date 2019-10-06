import Browsers.ChromeWebDriver;
import javafx.stage.Screen;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreentShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = ChromeWebDriver.getChrome();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\mcengiz.LISAACADEMY\\Desktop\\Comp\\Screen Shots\\Screen Shot.png"));
    }
}
