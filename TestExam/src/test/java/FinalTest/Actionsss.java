package FinalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\TestExam\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://wwww.filpkart.com");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
		act.moveToElement(driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/span[5]"))).perform();
		//act.moveToElement(driver.findElement(By.xpath(""))).click();
		act.perform();
		act.doubleClick();
	}

}
