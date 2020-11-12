import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class login {

	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	System.setProperty("webdriver.ie.driver",".\\drivers\\IEDriverServer.exe");
	//WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
	//System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
	WebDriver driver=new InternetExplorerDriver();
/*DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();  ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
			true);
			WebDriver driver = new InternetExplorerDriver(ieCapabilities);
	*/
	
	//System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\Desktop\\selenium_maven\MavenProject\\drivers\\geckodriver.exe");
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
			
	  
	
	}

}
