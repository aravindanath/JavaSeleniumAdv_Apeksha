package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCSSID extends  BaseClass{


    @Test
    public void byid(){
        driver.get("https://www.amazon.com");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Smart watch", Keys.ENTER);
    }

}
