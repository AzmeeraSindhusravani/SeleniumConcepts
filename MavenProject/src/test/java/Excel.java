import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
Workbook wb;
public Excel(String inputpath) throws IOException, Throwable {
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
	 data = String.valueOf(celldata);
}else{
	data= wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
}
return data;
	
}
public static void main(String[] args) throws Throwable {
	Excel e= new  Excel("C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\Excel_input_data\\inputdata2.xlsx");
	System.out.println(e.getrow("Sheet2"));
	System.out.println(e.getcell("Sheet2"));
	System.out.println(e.getcelldata("Sheet2", 3, 0));
}
}
