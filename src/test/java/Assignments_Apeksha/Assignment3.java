package Assignments_Apeksha;

import locators.BaseClass;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment3 extends BaseClass
{
    @Test(priority = 1)
    public void login_success() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        Thread.sleep(3000);
        Assert.assertEquals("Welcome to the Secure Area. When you are done click logout below.",driver.findElement(By.xpath("//h4[@class='subheader']")).getText());

    }

    @Test(priority = 2)
    public void login_failure() throws InterruptedException
    {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        Thread.sleep(3000);
        Assert.assertEquals("Welcome to the Secure Area. When you are done click logout below.",driver.findElement(By.xpath("//h4[@class='subheader']")).getText());


    }

    @Test(priority = 3)
    public void checkbox() throws InterruptedException
    {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement Checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement Checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));


        if(Checkbox1.isSelected()==false)
        {
            Checkbox1.click();
            Assert.assertEquals(true, Checkbox1.isSelected());
        }
        else if(Checkbox2.isSelected()==false)
        {
            Checkbox2.click();
            Assert.assertEquals(true, Checkbox2.isSelected());
        }

    }

    @Test(priority = 4)
    public void context_menu()
    {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.id("hot-spot"));
        actions.contextClick(element).perform();
        Alert a1=driver.switchTo().alert();
        Assert.assertEquals("You selected a context menu",a1.getText());

    }
    @Test(priority = 5)
    public void drag_drop() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));
        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor)driver;

        final String java_script="var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffect:'',effectAllowed:'all',files:[],items:{},types:[],setData:function(format,data){this.items[format]=data;this.types.append(format);},getData:function(format){return this.items[format];},clearData:function(format){}};var emit=function(event,target){var evt=document.createEvent('Event');evt.initEvent(event,true,false);evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit('drop',tgt);emit('dragend',src);";

        ((JavascriptExecutor)driver).executeScript(java_script, source, target);
        Thread.sleep(3000);
         Assert.assertEquals("B",source.getText());
         Assert.assertEquals("A",target.getText());

    }
    @Test(priority = 6)
    public void drop_down()
    {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.id("dropdown"));
        Select s=new Select(element);
        s.selectByValue("1");
        String option=s.getFirstSelectedOption().getText().trim();
        Assert.assertEquals("Option 1",option);
        s.selectByValue("2");
        String option2=s.getFirstSelectedOption().getText().trim();
        Assert.assertEquals("Option 2",option2);
    }
    @Test(priority = 7)
    public void dynamic_content()
    {
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        driver.manage().window().maximize();
        String T1=driver.findElement(By.xpath("(//div[@class='large-10 columns'])[1]")).getText();
        System.out.println(T1);
        driver.navigate().refresh();
        String T2=driver.findElement(By.xpath("(//div[@class='large-10 columns'])[1]")).getText();
        System.out.println(T2);
        Assert.assertNotEquals(T1,T2);
    }







}
