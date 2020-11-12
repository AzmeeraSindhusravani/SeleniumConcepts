package FinalTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsertesting {
	WebDriver driver;
	@Test
	@Parameters("browser")
public void opengg(String browsername){
		if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\TestExam\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
		}else if(browsername.equalsIgnoreCase("firfox")){
			System.setProperty("webdriver.firfox.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\TestExam\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
		}
	
	
}
	
	}

