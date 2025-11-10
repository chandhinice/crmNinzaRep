package listner_Utility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import crm.baseclass.BaseClass;
import crm.baseclass.DummyBaseClass;
import crm.generic.webdriverutility.Java_Utiltiy;

public class ListnerImplementation  implements ITestListener,ISuiteListener{ 
	@Override
	public void onTestStart(ITestResult result)
	{
		 String methodName =result.getMethod().getMethodName();
		 Reporter.log("======"+methodName+"===Started=========", true);
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
		Java_Utiltiy jutil= new Java_Utiltiy();
			 String dateTime =jutil.getSystemDateAndTimeForScreenshot();
//			 TakesScreenshot tss=(TakesScreenshot)DummyBaseClass.sdriver;
//			 File temp =tss.getScreenshotAs(OutputType.FILE);
			  TakesScreenshot tks=(TakesScreenshot)BaseClass.sdriver;
			 File temp =tks.getScreenshotAs(OutputType.FILE);
					  try 
					  {
						  
						FileUtils.copyFile(temp,new File("./Screenshots/"+methodName+dateTime+".png") );
					  } 
					  catch (IOException e)
					  {
					  
					      e.printStackTrace();
					    
					  }
			 Reporter.log("======"+methodName+"===FAIL ED=========", true);
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
				 }
	 @Override
			public void onFinish(ISuite suite) 
	 	{
			 Reporter.log("Report Back up", true);
		}
					

} 
			 
	
	
	
	

