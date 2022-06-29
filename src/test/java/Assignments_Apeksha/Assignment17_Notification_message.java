package Assignments_Apeksha;

import locators.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class Assignment17_Notification_message extends BaseClass {
    @Test
    public void notification_message() {
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.xpath("(//a)[3]")).click();
        Set<String> allwindows = driver.getWindowHandles();
        ArrayList<String> tabs=new ArrayList<>(allwindows);
        for (String s : tabs) {
            System.out.println("Tabs: " + s);
        }
        driver.switchTo().window(tabs.get(0));

        String s1 = driver.findElement(By.xpath("//div[@id='flash']")).getText();

        System.out.println(s1);

        if (s1.equals("Action Successful"))
        {
             System.out.println("Test Case Passed");
        }
        else if (s1.equals("Action unsuccessful, please try again"))
        {
            System.out.println("Test Case Passed");
        }
        else if (s1.equals("Action Unsuccessful"))
        {
            System.out.println("Test Case Passed");
        }
        else
        {
            System.out.println("Test Case failed");
        }


    }
}


