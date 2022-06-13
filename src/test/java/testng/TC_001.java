package testng;

import locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC_001 extends BaseClass {


    @Test
    public void byid(){
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart watch", Keys.ENTER);
    }

}
