package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXapth2 extends  BaseClass{


    @Test
    public void byid(){
        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name='q']")).sendKeys("Selenium Jobs", Keys.ENTER);
    }



}
