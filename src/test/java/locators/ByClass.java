package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByClass extends  BaseClass{


    @Test
    public void byid(){
        driver.get("https://www.icicibank.com/#");
        driver.findElement(By.className("ic-btn")).click();
    }

}