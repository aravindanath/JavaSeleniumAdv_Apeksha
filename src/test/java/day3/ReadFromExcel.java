package day3;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromExcel {
    public static void main(String[] args) throws IOException {

        // Root path of the project
        String path = System.getProperty("user.dir")+ File.separator+"testdata"+File.separator+"data.xlsx";

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
       Sheet sh =  wb.getSheetAt(1);
      String vsl =  sh.getRow(0).getCell(0).getStringCellValue();
      System.out.println(vsl);


    }
}
