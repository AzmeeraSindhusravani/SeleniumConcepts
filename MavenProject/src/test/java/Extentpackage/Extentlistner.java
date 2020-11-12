package Extentpackage;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Extentlistner implements ITestListener {
WebDriver driver;
ExtentTest test;
ExtentReports extent=Extentmastr.createInstance();
public void onTestStart(ITestResult result){
	test=extent.createTest(result.getMethod().getMethodName());
}
public void onTestSuccess(ITestResult result){
	test.log(Status.PASS,"success");
}
public void onTestFailure(ITestResult result){
	test.fail(result.getThrowable());
}
public void onTestSkipped(ITestResult result){
	
}
public void onTestFailWithinSuccessPercentage(ITestResult result){
	
}
public void onStart(ITestContext context){
	
}
public void onFinish(ITestContext context){
	extent.flush();
}
}