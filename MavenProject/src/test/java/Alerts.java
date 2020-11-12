
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com");
	driver.manage().window().maximize();
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
