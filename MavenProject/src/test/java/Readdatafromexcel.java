import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdatafromexcel {
public static void main(String[] args) throws IOException {
	
FileInputStream fis =new FileInputStream("C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\Excel_input_data\\testdata.xlsx");
 XSSFWorkbook wb=new XSSFWorkbook(fis);
 XSSFSheet s=wb.getSheetAt(0);
// System.out.println(s);
 
 XSSFRow r=s.getRow(1);
 XSSFCell c=r.getCell(0);
 //String.valueOf(c.getStringCellValue());
 
 System.out.println(c.getStringCellValue());
 //System.out.println(String.valueOf(c.getNumericCellValue()));
 
}
}

