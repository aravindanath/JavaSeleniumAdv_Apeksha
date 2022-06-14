package testng;

import locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC_002 extends BaseClass {


    @Test
    public void byid(){
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium jobs", Keys.ENTER);
    }

}
