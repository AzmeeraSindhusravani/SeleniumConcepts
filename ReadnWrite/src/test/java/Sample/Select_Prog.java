package Sample;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Prog {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\ReadnWrite\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		Select sel= new Select(driver.findElement(By.id("day")));
		sel.selectByIndex(2);
		SimpleDateFormat simple= new SimpleDateFormat("yy-mm-dd hh-mm-ss");
		Date date= new Date();
		String str= simple.format(date);
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./screenshot/fb"+str+".png"));
		
		

	}

}
