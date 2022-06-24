package Assignments_Apeksha;

import locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment6_AutoSuggestion extends BaseClass
{
    @Test
    public void auto_suggestions() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone");
        Thread.sleep(2000);
        List<WebElement> li = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
        System.out.println("Total Auto Suggetions: "+li.size());


        for(WebElement e:li)
        {
            System.out.println(e.getText());

        }
        


    }


}
