import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Hel")).click();
	Set<String> set=driver.getWindowHandles();
	ArrayList<String> arraylist= new ArrayList<String>(set);
	driver.switchTo().window(arraylist.get(0));
	System.out.println(driver.getTitle());
	driver.switchTo().window(arraylist.get(1));
	}
}
