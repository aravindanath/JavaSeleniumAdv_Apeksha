package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {


    protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("*********** Before suite *************");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("*********** After suite *************");
    }


    @BeforeClass
    public void setup(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(ops);
    }


    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


}
