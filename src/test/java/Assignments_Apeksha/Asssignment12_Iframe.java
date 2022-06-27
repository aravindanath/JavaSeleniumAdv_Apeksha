package Assignments_Apeksha;

import locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asssignment12_Iframe extends BaseClass
{
    @Test
    public void Iframe() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).clear();
        WebElement text=driver.findElement(By.id("tinymce"));

        text.sendKeys("Testing Iframe with Selenium");
        String s1=text.getText();
        Thread.sleep(3000);
        Assert.assertEquals(s1,"Testing Iframe with Selenium");

    }
}
