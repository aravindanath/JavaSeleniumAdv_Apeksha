package day2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.util.Properties;

public class Generic {


    public static String getValue(String key) {
        String path = System.getProperty("user.dir") + File.separator + "Config.properties";
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fis);
            value = prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    public static void setValue() throws FileNotFoundException {
        String path1 = System.getProperty("user.dir") + File.separator + "Config.properties";
        FileOutputStream fis1 = new FileOutputStream(path1);
        try {
            Properties prop1 = new Properties();
            prop1.put("url1", "https://www.amazon.com");
            prop1.put("url2", "https://www.flipkart.com");
            prop1.store(fis1, "adding urls");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Properties file updated......");


    }

    public static void takeScreenShot(WebDriver driver){
        try {
            TakesScreenshot src = (TakesScreenshot) driver;
            File srShot = src.getScreenshotAs(OutputType.FILE);
            File dest = new File("./screenshot.png");
            FileUtils.copyFile(srShot, dest);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void takeFullScreenShot(WebDriver driver) {

        try {
            Screenshot screen = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
            ImageIO.write(screen.getImage(), "PNG", new File("./screenshot_full.png"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}

