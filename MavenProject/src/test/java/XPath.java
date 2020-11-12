
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.gmail.com");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sindhuvasavi143@gmail.com");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("sindhu@143");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(2000);
		dr.close();
	}

}
