import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\Excel_input_data\\testdata.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet xs= wb.getSheet("data1");
		Row r= xs.createRow(0);
		Cell c= r.createCell(0);
		c.setCellType(c.CELL_TYPE_STRING);
		c.setCellValue("Age");
		
		Row r1= xs.createRow(0);
		Cell c1= r1.createCell(1);
		c1.setCellType(c1.CELL_TYPE_STRING);
		c1.setCellValue("Name");
		
		
		Row r2= xs.createRow(0);
		Cell c2= r2.createCell(2);
		c2.setCellType(c2.CELL_TYPE_STRING);
		c2.setCellValue("DOB");
		FileOutputStream fos= new FileOutputStream("C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\Excel_input_data\\testdata.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("Written");
	}

}
