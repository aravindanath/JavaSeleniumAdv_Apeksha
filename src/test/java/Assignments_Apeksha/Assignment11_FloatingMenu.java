package Assignments_Apeksha;

import com.fasterxml.jackson.databind.ext.Java7Support;
import locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Assignment11_FloatingMenu extends BaseClass
{
    @Test
    public void floating_menu()
    {
       driver.get("https://the-internet.herokuapp.com/floating_menu");
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,5000)","");


       if(driver.findElement(By.id("menu")).isDisplayed())
       {
           System.out.println("Element is Visible");
       }
       else
       {
           System.out.println("Element is not visible");
       }




    }
}
