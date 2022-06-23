package Assignments_Apeksha;

import locators.BaseClass;
import net.bytebuddy.matcher.BooleanMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class Assignment4 extends BaseClass
{
    @Test
    public void dynamic_controls() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();

       // Test clicks on the Remove Button and uses explicit wait.

        WebDriverWait wait=new WebDriverWait(driver,100);
        WebElement remove_btn =driver.findElement(By.xpath("//button[text()='Remove']"));
        remove_btn.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[text()='Add']"),"Add"));


        //Test asserts that the checkbox is gone.
        By checkbox_locator=By.xpath("//div[@id='checkbox']");
        System.out.println(ExpectedConditions.invisibilityOfElementLocated(checkbox_locator));
        //This assertion verifies that there are no matching elements in the DOM and returns the value of Zero, so the assertion passes when the element is not present. Also it would fail if it was present.
       Thread.sleep(3000);
        Assert.assertEquals(0, driver.findElements(By.xpath("//div[@id='checkbox']")).size());


        //Test clicks on Add Button and uses explicit wait.
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[text()='Remove']"),"Remove"));
        Thread.sleep(3000);
        //Test asserts that the checkbox is present.
        Test();
        Assert.assertTrue(Test());











    }
    public boolean Test()
    {
        try
        {
            WebDriverWait wait1=new WebDriverWait(driver,100);
            wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='checkbox']")));
        }
        catch (NoSuchElementException exception)
        {
            return false;
        }
        return true;
    }


}
