package test.java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertspra {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenPractise\\drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://primusbank.qedgetech.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("txtuId")).sendKeys("abcse");
	    driver.findElement(By.name("txtPword")).sendKeys("abcse");
	    driver.findElement(By.id("login")).click();
	    String alertmessage=driver.switchTo().alert().getText();
	    System.out.println(alertmessage);
	    driver.switchTo().alert().accept();
	    driver.close();

	}

}
