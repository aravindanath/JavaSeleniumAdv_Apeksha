package day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Exceptions5 {


    public static void main(String[] args) throws IOException {

        System.out.println("Starting..");
            // Root path of the project
//        String path = System.getProperty("user.dir")+ File.separator+"Config.properties";
//
//        FileInputStream fis = new FileInputStream(path);
//        Properties prop = new Properties();
//        prop.load(fis);
//        String value = prop.getProperty("url");
//        System.out.println(value);

        System.out.println(Generic.getValue("url"));

    }
}
