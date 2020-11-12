package FinalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageupdonss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\TestExam\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Pages')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(ele.getText());

	}

}
