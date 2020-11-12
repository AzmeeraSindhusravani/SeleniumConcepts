import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageupdown {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)", "");
		WebElement Element=driver.findElement(By.xpath("//h2[contains(text(),'Product')]"));
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		System.out.println(Element.getText());
		//WebElement Element=driver.findElement(By.xpath("//h2[contains(text(),'Convert your DOC to PDF online')]"));
		//Element.sendKeys(Keys.PAGE_DOWN);
		
	}

}
