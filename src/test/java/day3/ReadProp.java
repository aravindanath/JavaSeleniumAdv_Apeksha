package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
    public static void main(String[] args) throws IOException {

        // Root path of the project
        String path = System.getProperty("user.dir")+ File.separator+"Config.properties";

        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        String value = prop.getProperty("url");
        System.out.println(value);
    }
}
