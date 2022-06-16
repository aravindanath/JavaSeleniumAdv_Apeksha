package locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXapth8 extends  BaseClass{


    @Test
    public void byid(){
        driver.get("https://the-internet.herokuapp.com/tables");

        String [] com =  {"John","Frank","Tim"};

        for(String str : com){
            String txt =  driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2][contains(text(),'"+str+"')]//preceding-sibling::td")).getText();

            System.out.println(str+" --> "+txt);
        }



    }



}
