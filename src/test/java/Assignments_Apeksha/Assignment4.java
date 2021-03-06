package Assignments_Apeksha;

import locators.BaseClass;
import net.bytebuddy.matcher.BooleanMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        //JavascriptExecutor j = (JavascriptExecutor) driver;
        //j.executeScript ("document.getElementById('checkbox')");


        //Test clicks on Add Button and uses explicit wait.

        WebElement add_btn = driver.findElement(By.xpath("//button[text()='Add']"));
        add_btn.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[text()='Remove']"), "Remove"));

        //Test asserts that the checkbox is present.
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed());

        //Test clicks on the Enable Button and uses explicit wait.
        WebElement enable_btn = driver.findElement(By.xpath("//button[text()='Enable']"));
        enable_btn.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[text()='Disable']"), "Disable"));

        //Test asserts that the text box is enabled.
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='text']")).isEnabled());

        //Test clicks on the Disable Button and uses explicit wait.
        WebElement disable_btn = driver.findElement(By.xpath("//button[text()='Disable']"));
        disable_btn.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[text()='Enable']"), "Enable"));

        //Test asserts that the text box is disabled.
        Assert.assertFalse(driver.findElement(By.xpath("//input[@type='text']")).isEnabled());









































    }



    }

