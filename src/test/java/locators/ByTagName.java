package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByTagName extends  BaseClass{


    @Test
    public void byid(){
        driver.get("https://www.google.com");
       List<WebElement> li =  driver.findElements(By.tagName("a"));

       System.out.println("Total Links "+ li.size());

       for(WebElement element : li){
           System.out.println(element.getText() +" -- > "+ element.getAttribute("href"));
       }
    }



}
