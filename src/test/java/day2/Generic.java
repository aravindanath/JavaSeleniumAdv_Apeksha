package day2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Generic {


    public static String getValue(String key){
        String path = System.getProperty("user.dir")+ File.separator+"Config.properties";
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fis);
            value = prop.getProperty(key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return value;
    }
}
