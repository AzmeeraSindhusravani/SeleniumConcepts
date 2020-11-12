package FinalTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tabless {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\TestExam\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement my_table=driver.findElement(By.id("customers"));
		List<WebElement>table_row=my_table.findElements(By.tagName("tr"));
		System.out.println(table_row.size());
        for(int i=0;i<table_row.size();i++){
        	List<WebElement>celldata=table_row.get(i).findElements(By.tagName("td"));
            System.out.println(celldata.size());
        	for(int j=0;j<celldata.size();j++){
        		String cell_data=celldata.get(j).getText();
        		System.out.println(cell_data);
        	}
        }
	}

}
