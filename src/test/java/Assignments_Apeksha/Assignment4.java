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

public class Assignment4 extends BaseClass {
    @Test
    public void dynamic_controls() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();

        // Test clicks on the Remove Button and uses explicit wait.

        WebDriverWait wait = new WebDriverWait(driver, 100);
        WebElement remove_btn = driver.findElement(By.xpath("//button[text()='Remove']"));
        remove_btn.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[text()='Add']"), "Add"));


        //Test asserts that the checkbox is gone.
        WebElement checkbox=driver.findElement(By.xpath("(//div[text()=' A checkbox'])[2]//preceding-sibling::div//input[@id='checkbox']"));
        Assert.assertFalse(checkbox.isDisplayed());

        





















    }



    }

