package Assignments_Apeksha;

import locators.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment15_JavaScript_Error extends BaseClass
{
    @Test
    public void JavaScriptError()
    {
        driver.get("https://the-internet.herokuapp.com/javascript_error");
        String p=driver.findElement(By.tagName("p")).getText();
        Assert.assertNotNull(p);
    }

}
