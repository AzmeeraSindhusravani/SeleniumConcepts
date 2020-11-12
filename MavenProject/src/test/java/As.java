import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class As {
	static WebDriver driver;
@BeforeTest
	public void openfb() throws Exception, Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(PropertyFileUtil.getValueForKey("url"));
    driver.manage().window().maximize();
    }
    @Test
    public void logg() throws Exception, Throwable{
    	Thread.sleep(3000);
    	driver.findElement(By.id("email")).sendKeys(PropertyFileUtil.getValueForKey("name"));
    driver.findElement(By.id("u_0_b")).click();
    WebElement ele=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]"));
   String err= ele.getText();
   Assert.assertEquals(err, "The email addrss or phone number that you've entered doesn't match any account. Sign up for an account.");
    
    //System.out.println("method1");
}
    
    
    @AfterTest
    public void cl(){
    	driver.close();
    }
}
