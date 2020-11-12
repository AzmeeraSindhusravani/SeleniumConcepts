package Sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roboo {
   public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium_maven\\ReadnWrite\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://smallpdf.com/word-to-pdf");
        driver.manage().window().maximize();
        ClipboardOwner owner=null;
        String pdf="C:\\Users\\User\\Downloads\\offices.pdf";
        driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]")).click();
        Robot r= new Robot();
        StringSelection sc= new StringSelection(pdf);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, owner);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("done");
        
        
        
        
	}

}
