package Extentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts {
	static WebDriver driver;
   @BeforeTest
	public static void onprimusbank(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com");
	driver.manage().window().maximize();
   }
   @Test
	public static void todo() throws Throwable{
	driver.findElement(By.name("txtuId")).sendKeys("abcdes");
	driver.findElement(By.id("txtPword")).sendKeys("lbsde");
	driver.findElement(By.id("login")).click();
	Thread.sleep(4000);
	String alertmessage=driver.switchTo().alert().getText();
	System.out.println(alertmessage);
	driver.switchTo().alert().accept();
	driver.close();
	}
}