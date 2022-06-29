package Assignments_Apeksha;

import locators.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class Assignment16_NewTab extends BaseClass
{
    @Test
    public void NewTab()
    {
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> allwindows = driver.getWindowHandles();
        ArrayList<String> tabs=new ArrayList<>(allwindows);
        for (String s : tabs) {
            System.out.println("Tabs: " + s);
        }

        driver.switchTo().window(tabs.get(1));
        String T1=driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(T1,"New Window");





    }

}
