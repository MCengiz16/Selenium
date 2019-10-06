import Browsers.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class TableSortVerify {
    private static String url="https://rahulshettyacademy.com/seleniumPractise/#/offers";
    private static By sort= By.xpath("//table[@id='sortableTable']/thead/tr/th[2]");
    private static By column= By.xpath("//table[@id='sortableTable']/tbody/tr/td[2]");

    public static void main(String[] args) {
        WebDriver driver = ChromeWebDriver.getChrome();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(sort).click();
        //driver.findElement(sort).click();


        List<WebElement> FruitsColumn= driver.findElements(column);

        List<String> OriginalFruits= new ArrayList<>();


        for (int i=0;i< FruitsColumn.size(); i++){
            OriginalFruits.add(FruitsColumn.get(i).getText());


        }

        List<String> ascendingSortedFruits= new ArrayList<>();


        for (int i=0;i< OriginalFruits.size(); i++){
            ascendingSortedFruits.add(OriginalFruits.get(i));


        }

        Collections.sort(ascendingSortedFruits);

        List<String> descendingSortedFruits= new ArrayList<>();


        for (int i=0;i< ascendingSortedFruits.size(); i++){
            descendingSortedFruits.add(ascendingSortedFruits.get(i));


        }

        Collections.reverse(descendingSortedFruits);



        System.out.println("Original list: "+OriginalFruits);
        System.out.println("ascendingSorted List: "+ascendingSortedFruits);
        System.out.println("descendingSorted List: "+descendingSortedFruits);

        if(OriginalFruits.equals(ascendingSortedFruits)) {
            System.out.println("Ascending order");
        }

        else if (OriginalFruits.equals(descendingSortedFruits)) {
                System.out.println("Descending order");
            }
        else {
                System.out.println("Not Ordered");
            }


driver.close();
    }
}
