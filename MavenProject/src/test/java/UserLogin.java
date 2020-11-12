import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserLogin {
	WebDriver driver;
	
@BeforeTest
public void url(){
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
}

	@Test
	public void loginfun() throws IOException, InterruptedException{
		FileInputStream fis =new FileInputStream("C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\Excel_input_data\\testdata.xlsx");
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet s=wb.getSheetAt(0);
		// System.out.println(s);
		 
		 XSSFRow r=s.getRow(1);
		 XSSFCell c=r.getCell(0);
		 //String.valueOf(c.getStringCellValue());
		 XSSFRow r1=s.getRow(1);
		 XSSFCell c1=r.getCell(1);
		
		 //System.out.println(c.getStringCellValue());
		// System.out.println(String.valueOf(c.getNumericCellValue()));

		driver.findElement(By.id("email")).sendKeys(c.getStringCellValue());
		Thread.sleep(4000);
		driver.findElement(By.id("pass")).sendKeys(c1.getStringCellValue());
		Thread.sleep(4000);
		driver.findElement(By.id("u_0_b")).click();
		
		
	}
	@AfterTest
	public void close(){
		//driver.close();
	}
}
