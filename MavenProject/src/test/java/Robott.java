import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robott {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();
		Screen_shot.screen();
		driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]")).click();
		Thread.sleep(7000);
		ClipboardOwner owner=null;
		String img="C:\\Users\\User\\Downloads\\offices.pdf";
		Robot r=new Robot();
		StringSelection sc=new StringSelection(img);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, owner);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V );
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("uploaded");
		
		

	}

}
