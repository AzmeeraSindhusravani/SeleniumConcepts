import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
      List<WebElement> links= driver.findElements(By.tagName("a"));
      System.out.println(links.size());
      for(int i=0;i<links.size();i++){
    	 //System.out.println(links.get(i).getText());
    	 WebElement url=links.get(i);
    	 String urllinks=url.getAttribute("href");
    	 System.out.println(urllinks);
    	   }
        }
	public static void verifylink(String Links){
		try{
	URL url=new URL(Links);
	HttpURLConnection httpurlconnect=(HttpURLConnection)url.openConnection();
	httpurlconnect.setConnectTimeout(3000);
	httpurlconnect.connect();
	if(httpurlconnect.getResponseCode()==200){
		System.out.println(Links+"  "+httpurlconnect.getResponseMessage());
	}
	if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
		System.out.println(Links+" "+httpurlconnect.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
		
	}
		}catch(Exception e){
			
		}
	}

}
