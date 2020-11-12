package Extentpackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentmastr {
static ExtentReports extent;
public static ExtentReports createInstance(){
String path=System.getProperty("user.dir")	+"\\Extent_Reports\\Report.html";
ExtentSparkReporter htmlreport=new ExtentSparkReporter(path);
htmlreport.config().setEncoding("utf-8");
htmlreport.config().setDocumentTitle("TestResult");
htmlreport.config().setReportName("AutomationResult");
htmlreport.config().setTheme(Theme.DARK);
extent=new ExtentReports();
extent.attachReporter(htmlreport);
extent.setSystemInfo("AutomationTester","sravani");
extent.setSystemInfo("Organization", "Home");
return extent;
}
}
