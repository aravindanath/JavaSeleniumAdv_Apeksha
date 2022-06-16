package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByPartialLinkText extends  BaseClass{


    @Test
    public void byid(){
        driver.get("https://www.google.com");
        driver.findElement(By.partialLinkText("Imag")).click();

        driver.findElement(By.name("q")).sendKeys("Selenium Jobs", Keys.ENTER);
    }



}
