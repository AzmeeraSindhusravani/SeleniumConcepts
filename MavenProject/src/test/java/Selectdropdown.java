import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(3000);
        Select s=new Select(driver.findElement(By.id("year")));
        s.selectByIndex(2);
        Thread.sleep(2000);
        s.selectByVisibleText("May");
        s.selectByValue("1994");
        
	}

}
