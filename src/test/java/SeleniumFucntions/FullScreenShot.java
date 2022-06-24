package SeleniumFucntions;

import day2.Generic;
import locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FullScreenShot extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://www.amazon.in/");



        Generic.takeFullScreenShot(driver);
    }

}
