import Browsers.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddToCardProblem {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = ChromeWebDriver.getChrome();
        String[] veggies = {"Cucumber", "Brocolli","Beetroot","Walnuts"};
        List items = Arrays.asList(veggies);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait= new WebDriverWait(driver,10);

        int j = 0;

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));


        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();


            if (items.contains(formattedName)) {

                //click add to card


                driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
                j++;

            }
            if (j == items.size()) {
                break;
            }
        }
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.cssSelector("input.promoCode")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));

        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();



    }
}
