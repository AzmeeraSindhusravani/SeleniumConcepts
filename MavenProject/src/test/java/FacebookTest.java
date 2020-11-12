import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTest {
static WebDriver driver;
@BeforeMethod
public void URL(){
System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
}
@Test
public void B() throws Throwable{
System.out.println("login1");
Excel e = new Excel("C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\Excel_input_data\\inputdata2.xlsx");
System.out.println(e.getrow("data"));
}
@Test
public void A(){
System.out.println("login2");
}
@AfterMethod
public void closebrowser(){
	driver.close();
}
}
