package crm.SampleTest;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import crm.baseclass.DummyBaseClass;
import crm.generic.fileutility.Excel_utility;
import crm.pomclass.CreateCampPage_WebElements;
import crm.pomclass.HomePage_WebElements;
import listner_Utility.ListnerImplementation;
import listner_Utility.ListnersImplementationWithExtentReports;
@Listeners(ListnersImplementationWithExtentReports.class)

public class CreateCampTest extends DummyBaseClass {
	@Test
	
	public void createCampTest() throws IOException, InterruptedException
	{
//       Wlib.handleNotificationPopups();
//		Thread.sleep(3000);

		Thread.sleep(3000);
		//handle the pop up
		
//		
		//Click on the required module
		HomePage_WebElements home= new HomePage_WebElements(driver);
		Thread.sleep(3000);
		home.getCREATE_CAMPAIGN().click();
		int rand_no=jlib.getRandomNumber(100);
		
		//Read data from Excel file
		Excel_utility Elib= new Excel_utility();
		String CAMPNAME=Elib.getDataFromEXcel("CreateCamp", 1, 2)+rand_no;
		String TARGET_SIZE=Elib.getDataFromEXcel("CreateCamp", 2, 2);
		CreateCampPage_WebElements camp=new CreateCampPage_WebElements(driver);
		camp.createCampWithmandatoryFeilds(CAMPNAME, TARGET_SIZE);
		//verify campaign creation
		WebElement message =camp.getMessage();
		 Wlib.waitForElementToBeVisisble(driver,message);
		String msg = message.getText();
		
		/*
		 * if(msg.contains(CAMPNAME)) {
		 * System.out.println("Successfully Created the campaign "+ CAMPNAME); } else {
		 * System.out.println("Failed to Create the campaign "+ CAMPNAME); }
		 */
		boolean status=msg.contains(CAMPNAME);
		//Hard assert
		
		/*
		 * Assert.assertEquals(status, true,"Failed to create the Campaign"+CAMPNAME);
		 * Reporter.log("Successfully Created the Campaign"+CAMPNAME);
		 */
		
		  SoftAssert soft= new SoftAssert(); soft.assertEquals(status,
		  true,"Failed to Create the campaign "+CAMPNAME);
		  Reporter.log("Successfully Created the campaign "+CAMPNAME, true);
		  soft.assertAll();
		 
		
	}


}
