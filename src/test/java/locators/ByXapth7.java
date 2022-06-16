package locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXapth7 extends  BaseClass{


    @Test
    public void byid(){
        driver.get("https://www.moneycontrol.com/markets/global-indices/");

        String [] com =  {"GOLD","SILVER","COTTON"};

        for(String str : com){
            String txt =  driver.findElement(By.xpath("(//table[@class='mctable1'])[3]/tbody/tr/td/p/a[contains(text(),'"+str+"')]//following::td[1]")).getText();

            System.out.println(str+" --> "+txt);
        }



    }



}
