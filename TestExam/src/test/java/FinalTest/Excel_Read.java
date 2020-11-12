package FinalTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Read {
	Workbook wb;
	static String outputpath="C:\\Users\\User\\Desktop\\selenium_maven\\TestExam\\exceldata\\datasheet.xlsx";
public Excel_Read(String inputpath) throws Throwable{
	FileInputStream fis=new FileInputStream(inputpath);
	wb=WorkbookFactory.create(fis);
}
public int getRow(String sheetname){
	return wb.getSheet(sheetname).getLastRowNum();
}
public int getCell(String sheetname){
	return wb.getSheet(sheetname).getRow(0).getLastCellNum();
}
public String getCelldata(String sheetname,int row,int cell){
	String data;
	if(wb.getSheet(sheetname).getRow(row).getCell(cell).getCellType()==Cell.CELL_TYPE_NUMERIC){
		int celldata=(int)wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
		data=String.valueOf(celldata);
	}
	data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	
return data;
}
public void setcelldata(String sheetname,int row,int cell,String status,String outputpath) throws Throwable{
	wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(status);
	FileOutputStream fo=new FileOutputStream(outputpath);
	wb.write(fo);
}
public static void main(String[] args) throws Throwable {
	Excel_Read e=new Excel_Read("C:\\Users\\User\\Desktop\\selenium_maven\\TestExam\\exceldata\\datasheet.xlsx");
	System.out.println(e.getRow("Sheet1"));
	System.out.println(e.getCelldata("Sheet1", 0, 1));
	e.setcelldata("Sheet1", 0, 1, "pass", outputpath);
}
}

