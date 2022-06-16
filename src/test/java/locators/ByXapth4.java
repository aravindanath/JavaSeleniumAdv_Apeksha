package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXapth4 extends  BaseClass{


    @Test
    public void byid(){
        driver.get("https://www.amazon.in");

        driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click();
    }



}
