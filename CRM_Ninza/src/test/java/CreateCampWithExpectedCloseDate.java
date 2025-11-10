

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import crm.generic.fileutility.Excel_utility;
import crm.generic.fileutility.File_Utility;
import crm.generic.webdriverutility.Java_Utiltiy;
import crm.generic.webdriverutility.WebDriver_Utility;

public class CreateCampWithExpectedCloseDate {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	//Launch The Browser
			WebDriver driver=null;
			File_Utility Flib=new File_Utility();
			String BROWSER = Flib.readDataFromPropertyFile("browser");
			Java_Utiltiy jlib=new Java_Utiltiy();
			
			if(BROWSER.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(BROWSER.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else
			{
				driver=new EdgeDriver();
			}
			String USERNAME=Flib.readDataFromPropertyFile("username");
			String PASSWORD=Flib.readDataFromPropertyFile("password");
			
			//wait for page to load
			
			WebDriver_Utility Wlib=new WebDriver_Utility();
			Wlib.waitForPageTOLoad(driver);
			
			//Navigate to application
			driver.get(Flib.readDataFromPropertyFile("url"));
			Wlib.maxTheWindow(driver);
			//Login to application
			Login_Page_WebElements login=new Login_Page_WebElements(driver);
			login.loginToapp(USERNAME, PASSWORD);
			
			
			//this method handles the notification
			Wlib.handleNotificationPopups();
			Thread.sleep(3000);
			HomePage_WebElements home= new HomePage_WebElements(driver);
			home.getCREATE_CAMPAIGN().click();
			//Read data from Excel file
			Excel_utility Elib= new Excel_utility();
			String CAMPNAME=Elib.getDataFromEXcel("CreateCamp", 1, 2)+jlib.getRandomNumber(100);
			System.out.println(CAMPNAME);
			String TARGET_SIZE=Elib.getDataFromEXcel("CreateCamp", 2, 2);
			CreateCampPage_WebElements camp=new CreateCampPage_WebElements(driver);
			String DATE = jlib.getRequireddate(5);
			
			camp.createCampWithmandatoryFeilds(CAMPNAME, TARGET_SIZE,DATE);
//		     Wlib.waitFofElementToBeClickable(driver, camp.getMessage());  
//			System.out.println(camp.getMessage().getText());
			Thread.sleep(10000);
			//Logout from the application
			LogoutPage_WebElements logout=new LogoutPage_WebElements(driver);
			Wlib.mouseHover(driver, logout.getProfile());
			logout.getLogout().click();
			
			//close the browser
			
			
			driver.quit();
			
		
			
			


}
}
