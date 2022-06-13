package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver=   WebDriverManager.chromedriver().create();
        driver.get("https://www.tripadvisor.in/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       WebElement element =  driver.findElement(By.xpath("(//input[@type='search'])[2]"));
       element.click();
      element.sendKeys("Club Mahindra");


        Actions actions =new Actions(driver);
        Action clickEnter=actions.sendKeys(Keys.ENTER).build();
        clickEnter.perform();










    }



}
