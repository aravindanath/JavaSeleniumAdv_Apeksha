package SeleniumFucntions;

import com.google.gson.Gson;
import day2.Generic;
import locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AutosuggestionAndCal extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://www.redbus.in/");


        driver.findElement(By.id("src")).sendKeys("Bang");



       List<WebElement> src =    driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));

       System.out.println("Total pickup : "+ src.size());

       for(WebElement ele : src){
           System.out.println(ele.getText());
           if(ele.getText().equals("Bangalore Airport, Bangalore")){
               ele.click();
               break;
           }

       }




        driver.findElement(By.id("dest")).sendKeys("Hyd");


        List<WebElement> dest =    driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));

        System.out.println("Total drop : "+ dest.size());

        for(WebElement ele : dest){
            System.out.println(ele.getText());
            if(ele.getText().equals("Jubilee Bus Station JBS, Hyderabad")){
                ele.click();
                break;
            }

        }

        driver.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-onward-calendar.icon")).click();

      List<WebElement> cal =   driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));

      for(WebElement ele : cal){
          if(ele.getText().equals("30")){
              ele.click();
              break;
          }
      }

      driver.findElement(By.id("search_btn")).click();


      Thread.sleep(5000);

        Generic.takeScreenShot(driver);
    }

}
