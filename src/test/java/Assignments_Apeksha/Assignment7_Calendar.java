package Assignments_Apeksha;

import locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment7_Calendar extends BaseClass
{
    @Test
    public void select_date() throws InterruptedException {
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#src")).sendKeys("Bang");
        List<WebElement> s1 = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
        System.out.println("Total pickup points"+s1.size());
        for(WebElement e:s1)
        {
            System.out.println(e.getText());
            if(e.getText().equals("Electronic City, Bangalore"))
            {
                e.click();
                break;
            }

        }
        driver.findElement(By.cssSelector("#dest")).sendKeys("Mum");


        List<WebElement> s2 = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
        System.out.println("Total Drop points"+s1.size());
        for(WebElement e:s2)
        {
            System.out.println(e.getText());
            if(e.getText().equals("Belapur CBD, Mumbai"))
            {
                e.click();
                break;
            }

        }

        driver.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-onward-calendar.icon")).click();

        driver.findElement(By.cssSelector(".next")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector(".monthTitle")).getText(),"July 2022");

        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));

        for(WebElement e:dates)
        {
            if(e.getText().equals("15"))
            {
                e.click();
                break;
            }
        }

        driver.findElement(By.cssSelector("#search_btn")).click();

        Thread.sleep(2000);

        driver.quit();











    }
}
