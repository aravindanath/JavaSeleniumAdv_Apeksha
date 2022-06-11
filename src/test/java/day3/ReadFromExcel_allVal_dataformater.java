package day3;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel_allVal_dataformater {
    public static void main(String[] args) throws IOException {

        // Root path of the project
        String path = System.getProperty("user.dir")+ File.separator+"testdata"+File.separator+"data.xlsx";

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
       Sheet sh =  wb.getSheetAt(1);

       int totalRowCount = sh.getLastRowNum();

       for( int i =0 ; i<totalRowCount+1;i++){
           String name =  sh.getRow(i).getCell(0).getStringCellValue();
           String city =  sh.getRow(i).getCell(1).getStringCellValue();
           String pincode =  sh.getRow(i).getCell(2).getStringCellValue();
           DataFormatter df = new DataFormatter();
           String age = df.formatCellValue(sh.getRow(i).getCell(3));
           System.out.println(name +" | "+city +" | "+ pincode +" | "+age);

       }


    }
}
