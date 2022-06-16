package Assignments_Apeksha;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Assignment1
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverManager.chromedriver().create();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 13 256 GB");
        driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();

        Thread.sleep(3000);

        String XpathAmazonProduct="(//*[@class='a-section']/div/div[2]/div/div/div/h2/a/span)[1]";
        String s1=driver.findElement(By.xpath(XpathAmazonProduct)).getText();
        System.out.println("Amazon Product:"+s1);
        String price1=driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]")).getText();
        System.out.println("Amazon Price: "+price1);

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        Actions actions =new Actions(driver);
        Action sendEsc=actions.sendKeys(Keys.ESCAPE).build();
        sendEsc.perform();

        driver.findElement(By.name("q")).sendKeys("iPhone 13 256 GB");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        Thread.sleep(3000);

        String XpathforProduct="(//*[@class='_13oc-S']/div/div/a/div[2]/div/div[1])[1]";
        String ProductName=driver.findElement(By.xpath(XpathforProduct)).getText();
        System.out.println("Flipkart Product: "+ProductName);


        String XpathforProductAmount="(//*[@class='_3tbKJL']/div/div)[1]";
        String ProductAmount=driver.findElement(By.xpath(XpathforProductAmount)).getText();
        System.out.println("Flipkart Price: "+ProductAmount);


        String numonlyprice= price1.replaceAll("[^0-9]", "");
        String numonlyprice2= ProductAmount.replaceAll("[^0-9]", "");

        //System.out.println(isNumeric(numonlyprice));
        //System.out.println(isNumeric(numonlyprice2));

        try{
            Integer number1 = Integer.valueOf(numonlyprice);
            //System.out.println(number1);
            Integer number2 = Integer.valueOf(numonlyprice2);
           // System.out.println(number2);
            System.out.println("*************************************************************");
            if(number1<number2)
            {
                System.out.println("Amazon has lesser value for selected product");
            }
            else
            {
                System.out.println("Flipkart has lesser value for selected product");
            }

        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }




    }
    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }


}


