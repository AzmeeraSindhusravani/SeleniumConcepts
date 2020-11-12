import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam_r {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]")).click();
		ClipboardOwner owner=null;
		String file="D:\\8846266_133792_7608366361.pdf";
		Robot r=new Robot();
		StringSelection s=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, owner);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V );
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
