package locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXapth6 extends  BaseClass{


    @Test
    public void byid(){
        driver.get("https://www.amazon.in");

        driver.findElement(By.xpath("//a[starts-with(text(),'Today')]")).click();
    }



}
