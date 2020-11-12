package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\ReadnWrite\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.id("customers"));
		List<WebElement>row= table.findElements(By.tagName("tr"));
		int rcout= row.size();
		System.out.println(rcout);
		for(int i=0;i<rcout; i++){
			List<WebElement>cell= row.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cell.size(); j++){
				String celldata=cell.get(j).getText();
				System.out.println(celldata);
			}	
		}
	}

}
