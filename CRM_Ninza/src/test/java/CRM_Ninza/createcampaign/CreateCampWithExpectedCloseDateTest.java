package CRM_Ninza.createcampaign;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import crm.baseclass.BaseClass;
import crm.generic.fileutility.Excel_utility;
import crm.generic.webdriverutility.Java_Utiltiy;
import crm.pomclass.Login_Page_WebElements;
import crm.pomclass.CreateCampPage_WebElements;
import crm.pomclass.HomePage_WebElements;
import listner_Utility.ListnerImplementation;
import listner_Utility.ListnersImplementationWithExtentReports;
@Listeners(ListnersImplementationWithExtentReports.class)
public class CreateCampWithExpectedCloseDateTest extends BaseClass
{
	//@Parameters("Browser")
   @Test(groups = {"SmokeTest","RegressionTest"})
	public void createCampWithExpDateTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
			
			//Click on the required module
			
			HomePage_WebElements home = new HomePage_WebElements(driver);
			home.getCREATE_CAMPAIGN().click();
			
			//Read data from Excel file
			Excel_utility Elib= new Excel_utility();
			String CAMPNAME=Elib.getDataFromEXcel("CreateCamp", 1, 2);
			System.out.println(CAMPNAME);
			String TARGET_SIZE=Elib.getDataFromEXcel("CreateCamp", 2, 2);
			System.out.println(TARGET_SIZE);
			
			//Creating  a camp with expected date
			CreateCampPage_WebElements camp = new CreateCampPage_WebElements(driver);
	        String DATE=jlib.getRequireddate(5);
			camp.createCampWithExpDateFeilds(CAMPNAME, TARGET_SIZE, DATE);
			//verify campaign creation
			WebElement message =camp.getMessage();
			 Wlib.waitForElementToBeVisisble(driver,message);
			String msg = message.getText();
			boolean status=msg.contains(CAMPNAME);
			//SoftAssert
			SoftAssert soft= new SoftAssert(); 
			soft.assertEquals(status, true,"Failed to Create the campaign "+CAMPNAME);
			Reporter.log("Successfully Created the campaign "+CAMPNAME, true);
			soft.assertAll();
			
		}
}
