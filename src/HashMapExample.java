import Browsers.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HashMapExample {
    // Locators on main page
    private static By searchBox = By.id("txtSearch");
    private static By searchButton = By.id("btnSearch");

    // Locators on results page
    private static By yearMakeModel = By.cssSelector("tbody h4");
    private static By stockNumber = By.cssSelector("tbody text");
    private static By vinNumber = By.cssSelector("tbody tr td:nth-child(3) p:nth-of-type(2)");

    public static void main(String[] args) {
        WebDriver driver = ChromeWebDriver.getChrome();
        driver.get("https://www.iaai.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(searchBox).sendKeys("toyota corolla");
        driver.findElement(searchButton).click();


        List<Map<String,String>> carList = new ArrayList<>();

        List<WebElement> carVins = driver.findElements(vinNumber);
        List<WebElement> yearMakeModels = driver.findElements(yearMakeModel);
        List<WebElement> stockNumbers = driver.findElements(stockNumber);

        int numberOfCarsOnPage = carVins.size();

        for (int i = 0; i < numberOfCarsOnPage; i++) {
            Map<String,String> carMap = new java.util.HashMap<>();
            carMap.put("yearMakeModel", yearMakeModels.get(i).getText());
            carMap.put("vinNumber", carVins.get(i).getText());
            carMap.put("stockNumber", stockNumbers.get(i).getText());
            carList.add(carMap);
        }

        int counter2009Models = 0;
        for (Map<String,String> carMap : carList) {
            if (carMap.get("yearMakeModel").contains("2009")) {
                counter2009Models++;
                System.out.println(carMap.get("vinNumber"));
            }
        }
        System.out.println("There are total " + counter2009Models + " 2009 model cars on the page.");
    }

}
