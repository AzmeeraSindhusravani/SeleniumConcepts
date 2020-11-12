import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Imp_Expwaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    WebDriverWait wait=new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
	}

}
