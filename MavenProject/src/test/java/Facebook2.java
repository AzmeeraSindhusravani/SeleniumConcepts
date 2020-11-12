import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook2 {
	static WebDriver driver;
	@BeforeTest
	public void URL(){
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	}
	@Test(enabled=true)
	//(priority=1)
	public void B(){
	System.out.println("login1");
	}
	
	@Test(enabled=false)
	//(priority=2)
	public void A(){
	System.out.println("login2");
	}
	
	@AfterTest
	public void closebrowser(){
		driver.close();
	}
	}

