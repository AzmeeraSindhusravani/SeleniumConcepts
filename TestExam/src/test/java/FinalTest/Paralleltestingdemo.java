package FinalTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paralleltestingdemo {
	@Test
public void test1() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\TestExam\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
}
	@Test
public void test2() throws Throwable{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\TestExam\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	//driver.manage().window().maximize();
	Thread.sleep(3000);
	
}
}

