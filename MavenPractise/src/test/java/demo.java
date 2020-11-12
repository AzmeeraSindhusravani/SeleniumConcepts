package test.java;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo {
	static WebDriver driver;

	public void openflip() throws IOException, Throwable{ 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenPractise\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(propertyfileutil.getvalueforkey("url"));
	//driver.findElement(By.id("email")).sendKeys(propertyfileutil.getvalueforkey("name"));
	driver.manage().window().maximize();
	}
	
	public void brow(){
	WebElement ele=	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]"));
	String err=ele.getText();
	Assert.assertEquals(err, "Facebook is down fo required maintenance right now, but you should be able to get back on within a few minutes. In the meantime, read more about why you're seeing this message. Thanks for your patience as we improve the site."
);}
	
	public void bess(){
		driver.close();
	}
	public static void main(String[] args) throws IOException, Throwable {
		demo s = new demo();
		s.openflip();
	}
	
	}


