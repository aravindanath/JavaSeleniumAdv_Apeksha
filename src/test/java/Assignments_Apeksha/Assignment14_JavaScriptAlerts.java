package Assignments_Apeksha;


import locators.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment14_JavaScriptAlerts extends BaseClass
{
    @Test
    public void JavaScriptAlerts() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[contains(text(),'JS Alert')]")).click();
        String alert1=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(alert1,"I am a JS Alert");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
        String alert2=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(alert2,"I am a JS Confirm");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
        driver.switchTo().alert().sendKeys("Testing a JS Prompt Alert");
        driver.switchTo().alert().accept();
        String T1=driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(T1,"You entered: Testing a JS Prompt Alert");
        Thread.sleep(2000);


    }

}
