package Assignments_Apeksha;

import locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment8_DynamicLoading extends BaseClass
{
    @Test
    public void dynamic_loading()
    {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        WebDriverWait wait = new WebDriverWait(driver, 100);
        WebElement Start_btn = driver.findElement(By.xpath("//button[text()='Start']"));
        Start_btn.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h4[text()='Hello World!']"), "Hello World!"));

    }
}
