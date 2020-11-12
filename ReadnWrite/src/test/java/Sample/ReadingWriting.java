package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingWriting {
	Workbook wb;
	static String outputpath;
	public ReadingWriting(String inputpath) throws IOException, Throwable, Exception{
		FileInputStream fi= new FileInputStream(inputpath);
		wb= WorkbookFactory.create(fi);
	}
	public int getrow(String sheetname){
		return wb.getSheet(sheetname).getLastRowNum();
	}
	public int getcell(String sheetname){
		return wb.getSheet(sheetname).getRow(0).getLastCellNum();
	}
	public String getcelldata(String sheetname, int row, int cell){
		String data;
		if( wb.getSheet(sheetname).getRow(row).getCell(cell).getCellType()==Cell.CELL_TYPE_NUMERIC){
			int celldata= (int) wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
			data= String.valueOf(celldata);
		}else{
			data= wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();	
		}
		return data;
	}
	public void setcelldata(String sheetname, int row, int cell, String outputpath, String Status) throws IOException{
		wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(Status);
		FileOutputStream fo= new FileOutputStream("C:\\Users\\User\\Desktop\\selenium_maven\\ReadnWrite\\Excel\\Data.xlsx");
		wb.write(fo);
	}

	public static void main(String[] args) throws Throwable, Exception {
		ReadingWriting Rw= new ReadingWriting("C:\\Users\\User\\Desktop\\selenium_maven\\ReadnWrite\\Excel\\Data.xlsx");
		System.out.println(Rw.getrow("Sheet1"));
		System.out.println(Rw.getcell("Sheet1"));
		System.out.println(Rw.getcelldata("Sheet1", 3, 0));
		Rw.setcelldata("Sheet1", 0, 2, outputpath, "Fail");
	}

}
