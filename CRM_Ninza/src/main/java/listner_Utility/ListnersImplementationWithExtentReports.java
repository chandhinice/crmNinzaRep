package listner_Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import crm.baseclass.BaseClass;
import crm.baseclass.DummyBaseClass;
import crm.generic.webdriverutility.Java_Utiltiy;

public class ListnersImplementationWithExtentReports implements  ISuiteListener,ITestListener
{
   public ExtentReports report;
   public ExtentTest test;
  
@Override
public void onTestStart(ITestResult result)
{
	 String methodName =result.getMethod().getMethodName();
	 test = report.createTest(methodName);
	 test.log(Status.INFO,"======"+methodName+"===Started=========");
	 
}
	@Override
	public void onTestSuccess(ITestResult result)
	{
	  String methodName =result.getMethod().getMethodName();
	 Reporter.log("======"+methodName+"===SUCCESS=========", true);
	 
	 }
	@Override
	public void onTestFailure(ITestResult result) 
	{
		
			String methodName =result.getMethod().getMethodName();
			Java_Utiltiy jutil=new Java_Utiltiy();
				 test= report.createTest(methodName);
				 String dateTime =jutil.getSystemDateAndTimeForScreenshot();
				// TakesScreenshot tks=(TakesScreenshot)BaseClass.sdriver;
				 TakesScreenshot tks=(TakesScreenshot)DummyBaseClass.sdriver;
				 String temp =tks.getScreenshotAs(OutputType.BASE64);
				 test.addScreenCaptureFromBase64String(temp,methodName+"_"+dateTime);
				 test.log(Status.FAIL,"======"+methodName+"===FAILED=========");
		
	}
		
	
	@Override
			public void onTestSkipped(ITestResult result)
			{
					 String methodName = result.getMethod().getMethodName();
					 Reporter.log("======"+methodName+"===SKIPPED=========", true);
			  }
	 @Override
			public void onStart(ISuite suite)
	 			{
					  Reporter.log("Report Configuration",true);
					  Java_Utiltiy Jlib=new Java_Utiltiy();
						String currentTime = Jlib.getSystemDateAndTimeForScreenshot();
						//Extent Report setup
						ExtentSparkReporter spark = new ExtentSparkReporter ("./ExtentReports/Report_"+currentTime+".html");
						spark.config().setDocumentTitle("Ninza_CRM");
								 spark.config().setReportName("NinzaCRMReport");
								 spark.config().setTheme(Theme.DARK);
						//system Configuration details	
								 report= new ExtentReports();
								 report.attachReporter(spark);
								 report.setSystemInfo("OS","Windows11");
								 report.setSystemInfo("Browser","chrome");
				 }
	 @Override
			public void onFinish(ISuite suite) 
	 	{
			 Reporter.log("Report Back up", true);
			 report.flush();
		}
}
