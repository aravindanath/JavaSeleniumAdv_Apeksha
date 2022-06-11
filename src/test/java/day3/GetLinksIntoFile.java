package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.List;

public class GetLinksIntoFile {


    public static void main(String[] args) throws IOException {

        WebDriver driver=   WebDriverManager.chromedriver().create();

        driver.get("https://www.amazon.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total Links: "+links.size());

        String path = System.getProperty("user.dir")+File.separator+"Links.txt";

        File file = new File(path);
        if(file.exists()){
            System.out.println("File is already creadted!");
        }else {
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        for(WebElement element : links){
            bw.write(element.getText() +" ---> "+ element.getAttribute("href"));
            bw.newLine();
        }
        bw.flush();
        bw.close();


    }


}
