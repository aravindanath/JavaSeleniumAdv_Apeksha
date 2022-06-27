package Assignments_Apeksha;

import locators.BaseClass;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Asssignment9_FileDownload extends BaseClass
{
    private static String downloadPath = "C:\\Users\\Admin\\Downloads";
    @Test
    public void file_download()
    {
        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.xpath("//a[text()='Data.xlsx']")).click();


       Assert.assertTrue(isFileDownloaded(downloadPath, "Data.xlsx"), "Failed to download Expected document");


    }

    public boolean isFileDownloaded(String downloadPath, String fileName) {
        boolean flag = false;
        File dir = new File(downloadPath);
        File[] dir_contents = dir.listFiles();

        for (int i = 0; i < dir_contents.length; i++)
        {
            if (dir_contents[i].getName().equals(fileName))
                return flag=true;
        }

        return flag;
    }



}
