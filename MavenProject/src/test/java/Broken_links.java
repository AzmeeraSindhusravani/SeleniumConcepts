import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    List<WebElement>links=driver.findElements(By.tagName("a"));
    System.out.println(links.size());
    for(int i=0;i<links.size();i++){
    	WebElement ele=links.get(i);
    	System.out.println(ele);
    	String urllinks=ele.getAttribute("href");
    	System.out.println(urllinks);
  
	URL url=new URL(urllinks);
	HttpURLConnection httpurlconnect=(HttpURLConnection) url.openConnection();
	httpurlconnect.setConnectTimeout(3000);
	httpurlconnect.connect();
	if(httpurlconnect.getResponseCode()==200){
		System.out.println(urllinks+" "+httpurlconnect.getResponseMessage());
	}
	if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
		System.out.println(urllinks+" "+httpurlconnect.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
	}
	
	}
	}
}

