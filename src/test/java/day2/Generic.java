package day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
}

