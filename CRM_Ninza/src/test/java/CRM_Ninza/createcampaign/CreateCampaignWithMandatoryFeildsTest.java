package CRM_Ninza.createcampaign;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import crm.baseclass.BaseClass;
import crm.generic.fileutility.Excel_utility;
import crm.generic.fileutility.File_Utility;
import crm.generic.webdriverutility.Java_Utiltiy;
import crm.generic.webdriverutility.WebDriver_Utility;
import crm.pomclass.CreateCampPage_WebElements;
import crm.pomclass.HomePage_WebElements;
import crm.pomclass.Login_Page_WebElements;
import crm.pomclass.LogoutPage_WebElements;
import listner_Utility.ListnerImplementation;
import listner_Utility.ListnersImplementationWithExtentReports;
@Listeners(ListnersImplementationWithExtentReports.class)
public class CreateCampaignWithMandatoryFeildsTest extends BaseClass {
	
	//@Parameters("Browser")

	@Test(groups = {"SmokeTest","RegressionTest"})
	

	public void CreateCampTest() throws IOException, InterruptedException
	{
		
		//Click on the required module
		
		HomePage_WebElements home= new HomePage_WebElements(driver);
		home.getCREATE_CAMPAIGN().click();
		
		//Read data from Excel file
		Excel_utility Elib= new Excel_utility();
		String CAMPNAME=Elib.getDataFromEXcel("CreateCamp", 1, 2);
		String TARGET_SIZE=Elib.getDataFromEXcel("CreateCamp", 2, 2);
		CreateCampPage_WebElements camp=new CreateCampPage_WebElements(driver);
		camp.createCampWithmandatoryFeilds(CAMPNAME, TARGET_SIZE);
		//verify campaign creation
		WebElement message =camp.getMessage();
		 Wlib.waitForElementToBeVisisble(driver,message);
		String msg = message.getText();
		
		boolean status=msg.contains(CAMPNAME);
		//Hard assert
		  Assert.assertEquals(status, true,"Failed to create the Campaign"+CAMPNAME);
		  Reporter.log("Successfully Created the Campaign"+CAMPNAME);
		 
		
		  
		
		
	}

}
