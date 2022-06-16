package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCSSStarts extends  BaseClass{


    @Test
    public void byid(){
        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("input[class*='gLFyf']")).sendKeys("Selenium Jobs", Keys.ENTER);
    }

}
