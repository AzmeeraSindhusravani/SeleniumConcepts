package FinalTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\TestExam\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.primusbank.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("drlist")).sendKeys("dbcsd");
		driver.findElement(By.id("pswdtxt")).sendKeys("12eds");
		driver.findElement(By.id("login")).click();
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

}
