package Assignments_Apeksha;

import locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment13_MouseHover extends BaseClass
{
    @Test
    public void Mouse_Hover()
    {
        driver.get("https://the-internet.herokuapp.com/hovers");
        List<WebElement> elements=driver.findElements(By.className("figure"));

        for(WebElement e:elements)
        {
            Actions a = new Actions(driver);
            a.moveToElement(e).perform();
            WebElement s1=driver.findElement(By.xpath("//h5[text()='name: user1']"));
            String text=s1.getText();
            Assert.assertNotNull(text);
        }
    }
}
