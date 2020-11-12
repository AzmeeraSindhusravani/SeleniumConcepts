package test.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.nio.file.attribute.FileOwnerAttributeView;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.io.FileBackedOutputStream;

public class Excelre {
Workbook wb;
 static String outputpath="C:\\Users\\User\\Desktop\\selenium_maven\\MavenPractise\\data.xlsx";
public Excelre(String inputpath) throws Throwable{
	FileInputStream fis=new FileInputStream(inputpath);
	wb=WorkbookFactory.create(fis);
}
public int getrow(String sheetname){
	return wb.getSheet(sheetname).getLastRowNum();
}
public int getcell(String sheetname){
	return wb.getSheet(sheetname).getRow(0).getLastCellNum();
}
public String getcelldata(String sheetname,int row,int cell){
	String data;
	if(wb.getSheet(sheetname).getRow(row).getCell(cell).getCellType()==Cell.CELL_TYPE_NUMERIC){
		int celldata=(int) wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
		 data=String.valueOf(celldata);
	}else {
		
			data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		}
	return data;
	}
public  void setcelldata(String sheetname,int row,int cell,String outputpath,String status) throws Throwable{
	wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(status);
	FileOutputStream fo=new FileOutputStream(outputpath);
	wb.write(fo);
}
public static void main(String[] args) throws Throwable {
	Excelre r=new Excelre("C:\\Users\\User\\Desktop\\selenium_maven\\MavenPractise\\data.xlsx");
	System.out.println(r.getrow("Sheet1"));
	System.out.println(r.getcelldata("Sheet1", 0, 1));
	r.setcelldata("Sheet1", 0, 0,outputpath ,"successfull");
}
	}


