import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBScreenShot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	read_excel excel= new read_excel("C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\Excel_input_data\\inputdata2.xlsx");
		driver.findElement(By.id("email")).sendKeys(excel.getcelldata("Sheet2", 1, 0));
		driver.findElement(By.id("pass")).sendKeys(excel.getcelldata("Sheet2", 1, 1));
		driver.findElement(By.id("u_0_b")).click();
		driver.manage().window().maximize();
		SimpleDateFormat s= new SimpleDateFormat("dd-yy-mm hh-mm-ss");
		Date d= new Date();
		String d1= s.format(d);
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f ,new File( "./screenshot/fb"+d1+".png"));

	}

}
