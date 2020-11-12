import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_H {
	WebDriver driver;
	public void handle(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Help")).click();
	 Set<String>set= driver.getWindowHandles();
	 ArrayList<String>array= new ArrayList<String>(set);
	 System.out.println(driver.switchTo().window(array.get(1)));
	System.out.println(driver.getTitle());
	//driver.switchTo().defaultContent();
	//System.out.println(driver.getTitle());
		
	}
	public static void main(String[] args) {
		Window_H H= new Window_H();
		H.handle();
	
	}

}
