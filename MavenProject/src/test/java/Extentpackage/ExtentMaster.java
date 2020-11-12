package Extentpackage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


	

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

	public class ExtentMaster {
		 static ExtentReports extent;
		
		public static ExtentReports createInstance() {
	     	String path  =	System.getProperty("user.dir")+"\\Extent_Reports\\Report.html";
			ExtentSparkReporter htmlrepoter = new ExtentSparkReporter(path);
			    htmlrepoter.config().setEncoding("utf-8");
		        htmlrepoter.config().setDocumentTitle("Test Results");
		        htmlrepoter.config().setReportName("Automation Results");
		        htmlrepoter.config().setTheme(Theme.DARK);
		        extent = new ExtentReports();
		        extent.attachReporter(htmlrepoter);
		        extent.setSystemInfo("Automation Tester", "Sravani");
		        extent.setSystemInfo("Organization","Home");
		      
			return extent;
			
		}

	}


