package test.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenPractise\\drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.w3schools.com/html/html_tables.asp");
	    driver.manage().window().maximize();
	    WebElement my_table=driver.findElement(By.id("customers"));
	    List<WebElement>table_row=my_table.findElements(By.tagName("tr"));
	    int rowcount=table_row.size();
	    System.out.println(rowcount);
	    for(int i=0;i<table_row.size();i++){
	    List<WebElement>celldata=table_row.get(i).findElements(By.tagName("td"));
	    for(int j=0;j<celldata.size();j++){
	    	String cell_data=celldata.get(j).getText();
	    	System.out.println(cell_data);
	    }
	    }
	    

	}

}
