import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_excel {
    Workbook wb;
   static String outputpath="C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\Excel_input_data\\testdata.xlsx";
    public  read_excel(String inputpath) throws IOException, Throwable, InvalidFormatException{
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
    	int celldata=(int)wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
    	data=String.valueOf(celldata);
    	}else{
    		data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
    	
    	}
    	return data;
    }
    public void setcelldata(String sheetname, int row, int cell,String outputpath,String status) throws Throwable{
    	wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(status);
    	FileOutputStream fo=new FileOutputStream(outputpath);
    	wb.write(fo);
	
    	
    }
public static void main(String[] args) throws InvalidFormatException, IOException, Throwable {
	read_excel r=new read_excel("C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\Excel_input_data\\testdata.xlsx");
	System.out.println(r.getrow("log"));
	System.out.println(r.getcelldata("log", 0, 1));
	r.setcelldata("log",0 ,0, outputpath, "successfull");
}
}
