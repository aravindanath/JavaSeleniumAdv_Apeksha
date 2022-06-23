package Assignments_Apeksha;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.tripadvisor.in/");
        driver.manage().window().maximize();
        String Parent = driver.getWindowHandle();
        System.out.println("parent window id is" + Parent);

        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("(//input[@type='search'])[2]"));
        element.click();
        element.sendKeys("Club Mahindra");


        Actions actions = new Actions(driver);
        Action clickEnter = actions.sendKeys(Keys.ENTER).build();
        clickEnter.perform();

        WebDriverWait wait = new WebDriverWait(driver, 20);

        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='location-meta-block']/div/span)[1]")).click();
        Set<String> allWindows = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(allWindows);

        for (String s : tabs) {
            System.out.println("Tabs: " + s);
        }

        driver.switchTo().window(tabs.get(1));
        wait.until(titleIs("CLUB MAHINDRA MADIKERI, COORG (Kodagu (Coorg)) - Resort Reviews, Photos, Rate Comparison - Tripadvisor"));
        //String title=driver.getTitle();
        //  System.out.println("title 1"+title);


        Action ClickEscape = actions.sendKeys(Keys.ESCAPE).build();
        ClickEscape.perform();
        Thread.sleep(3000);

        WebElement n = driver.findElement(By.xpath("//a[text()='Most Booked Properties in Madikeri']"));

        //obtain element x, y coordinates with getLocation method
        Point p = n.getLocation();
        int X = p.getX();
        int Y = p.getY();
        //scroll with Javascript Executor
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(" + X + ", " + Y + ");");

        driver.findElement(By.xpath("(//a[text()='Write a review'])[2]")).click();


        Set<String> allWindows2 = driver.getWindowHandles();
        ArrayList<String> tabs2 = new ArrayList<>(allWindows2);

        for (String s : tabs2) {
            System.out.println("Tabs: " + s);
        }

        driver.switchTo().window(tabs2.get(2));


        WebElement ele = driver.findElement(By.xpath("//span[@id='bubble_rating']"));



//*******************************************************
        driver.findElement(By.xpath("//input[@name='ReviewTitle']")).sendKeys("AWESOME VIEW");
        driver.findElement(By.xpath("//textarea[@id='ReviewText']")).sendKeys("Extremely diverse knowledge and very well explained. Fantastic experience as they showed us different plants varying from bananas to fishtail palm and spices.Jaswanth and Priyam were very well informed and exhibited cordial bahaviour.");
        driver.findElement(By.xpath("//div[@data-category=\"Business\"]")).click();
        WebElement drpdwn = driver.findElement(By.id("trip_date_month_year"));
        Select s = new Select(drpdwn);
        s.selectByValue("3,2022");


        WebElement n1 = driver.findElement(By.xpath("//span[@class='optionalHeaderLabel']"));

        //obtain element x, y coordinates with getLocation method
        Point p1 = n1.getLocation();
        int X1 = p1.getX();
        int Y1 = p1.getY();
        //scroll with Javascript Executor
        JavascriptExecutor j1 = (JavascriptExecutor) driver;
        j1.executeScript("window.scrollBy(" + X1 + ", " + Y1 + ");");

        WebElement ele1 = driver.findElement(By.id("qid12_bubbles"));
        actions.moveToElement(ele1).perform();
        WebElement ele2 = driver.findElement(By.id("qid11_bubbles"));
        actions.moveToElement(ele2).perform();
        WebElement ele3 = driver.findElement(By.id("qid47_bubbles"));
        actions.moveToElement(ele3).perform();

        j1.executeScript("window.scrollBy(0,5000)");

        driver.findElement(By.xpath("//input[@id='noFraud']")).click();

        driver.findElement(By.id("SUBMIT")).click();


    }



}




