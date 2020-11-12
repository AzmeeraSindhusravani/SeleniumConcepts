import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screen_shot extends Robott{
	
	public static void screen() throws IOException{
		
			     
					
					SimpleDateFormat date = new SimpleDateFormat("dd_yy_mm hh_ss_mm");
					Date d = new Date();
					String d1= date.format(d);	
				         File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				       	FileUtils.copyFile(file, new File("./f/a+"+d1+".png"));
	}
			}

	


