import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practise {
WebDriver driver;
@BeforeTest
public void login(){
System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
driver.get("https://www.facebook.com");

}
@Test
public void facebook(){
driver.findElement(By.id("")).sendKeys("sindhusravani123@gmail.com");
}
}
