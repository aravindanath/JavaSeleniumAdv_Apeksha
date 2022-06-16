package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByXapth1 extends  BaseClass{


    @Test
    public void byid(){
        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium Jobs", Keys.ENTER);
    }



}
