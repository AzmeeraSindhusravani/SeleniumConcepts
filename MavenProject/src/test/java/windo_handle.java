import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windo_handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Actions ac= new Actions(driver);
		ac.sendKeys(Keys.ENTER);
		ac.contextClick();
		ac.moveToElement(driver.findElement(By.xpath("")));
		WebElement drag=driver.findElement(By.xpath(""));
		WebElement drop=driver.findElement(By.xpath(""));
		ac.dragAndDrop(drag, drop).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		
		
		

	}

}
