package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {


   WebDriver driver =     WebDriverManager.chromedriver().create();
   driver.get("https://www.wikipedia.org/");


   List<WebElement> lang = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));



   System.out.println(lang.size());

   ArrayList<String> str  = new ArrayList<>();

   for(WebElement element : lang){
     str.add(element.getText());
   }

   System.out.println("Before Sort: "+str);

        Collections.sort(str);

        System.out.println("After Sort; "+ str);
    }



}
