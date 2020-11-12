package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadandWrite {
	Workbook wb;
	static String outputpath;
	public ReadandWrite(String inputpath) throws IOException, Throwable{
		FileInputStream fis= new FileInputStream(inputpath);
		wb=WorkbookFactory.create(fis);
	}
	public int getrow(String sheetname){
		return wb.getSheet(sheetname).getLastRowNum();
	}
	public int getcell(String sheetname){
		return wb.getSheet(sheetname).getRow(0).getLastCellNum();
	}
	public String getcelldata(String sheetname, int row, int cell){
		String data;
		if(wb.getSheet(sheetname).getRow(row).getCell(cell).getCellType()==Cell.CELL_TYPE_NUMERIC){
		int celldata= (int) wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
		data= String.valueOf(celldata);
		}else{
			data= wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		}
		return data;
		
	}
	public void setcelldata(String sheetname, int cell, int row, String outputpath, String status) throws Throwable{
		 wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(status);
		 FileOutputStream fos= new FileOutputStream("C:\\Users\\User\\Desktop\\selenium_maven\\ReadnWrite\\Excel\\Data.xlsx");
		 wb.write(fos);
	}

	public static void main(String[] args) throws Throwable {
		ReadandWrite rw= new ReadandWrite("C:\\Users\\User\\Desktop\\selenium_maven\\ReadnWrite\\Excel\\Data.xlsx");
rw.getrow("Sheet1");
rw.getcell("Sheet1");
rw.getcelldata("Sheet1", 0, 2);
rw.setcelldata("Sheet1", 2, 0, outputpath, "pass");
	}

}
