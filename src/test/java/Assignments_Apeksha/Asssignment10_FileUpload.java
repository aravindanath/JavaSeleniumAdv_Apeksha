package Assignments_Apeksha;

import locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Asssignment10_FileUpload extends BaseClass
{
    @Test
    public void File_upload() throws InterruptedException
    {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Apeksha\\AMP\\TEST_FILE_UPLOAD.txt");
        Thread.sleep(2000);
        driver.findElement(By.id("file-submit")).click();
        WebElement fileupload=driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        String Fileupload=fileupload.getText();
       Assert.assertEquals(Fileupload,"File Uploaded!");
    }

}
