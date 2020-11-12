import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autooit {
     
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		//driver.findElement(By.cssSelector("input[type=file][name='uploaded_file']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]")).click();
		Thread.sleep(8000);
		Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\f\\fileautoit.exe");
      Thread.sleep(8000);
	}

}
