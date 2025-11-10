package crm.baseclass;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import crm.generic.fileutility.File_Utility;
import crm.generic.webdriverutility.Java_Utiltiy;
import crm.generic.webdriverutility.WebDriver_Utility;
import crm.pomclass.Login_Page_WebElements;
import crm.pomclass.LogoutPage_WebElements;

public class DummyBaseClass {
	public WebDriver driver=null;
	 public File_Utility Flib=new File_Utility();
	 public WebDriver_Utility Wlib=new WebDriver_Utility();
	public Java_Utiltiy jlib=new Java_Utiltiy();
	public static WebDriver sdriver=null;
	
	@BeforeSuite
	public void ConfigBS() 
	{
		System.out.println("Establish Connectivity to Db");
	}

	@BeforeTest
	
	public void configBT()
	{
		System.out.println("Pre-condition before Test");
	}
	
	@BeforeClass
	public void configBC() throws IOException
	{
		String BROWSER = Flib.readDataFromPropertyFile("browser");
        
		
		
		if(BROWSER.equals("chrome"))
		{
			ChromeOptions options=new ChromeOptions();
			
//			options.addArguments("--disable-features=PasswordLeakDetection");
			
			Map<String, Object> prefs=new HashMap<>();
			prefs.put("profile.password_manager_leak_detection",false);
	        options.setExperimentalOption("prefs",prefs);
	        
			driver=new ChromeDriver(options);
		}
		else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		sdriver=driver;
		
		//wait for page to load
		
		WebDriver_Utility Wlib=new WebDriver_Utility();
		Wlib.waitForPageTOLoad(driver);
		
		//Navigate to application
		driver.get(Flib.readDataFromPropertyFile("url"));
		Wlib.maxTheWindow(driver);
		
	}
	@BeforeMethod
	public void ConfigBM() throws IOException
	{
		//Login to application
				String USERNAME=Flib.readDataFromPropertyFile("username");
				String PASSWORD=Flib.readDataFromPropertyFile("password");
				Login_Page_WebElements login=new Login_Page_WebElements(driver);
				login.loginToapp(USERNAME, PASSWORD);
				System.out.println("Login Successfull");
	}
	@AfterMethod
	public void ConfigAM() throws InterruptedException
	{
		//Logout from the application
		Thread.sleep(10000);
		LogoutPage_WebElements logout=new LogoutPage_WebElements(driver);
		Wlib.mouseHover(driver, logout.getProfile());
		logout.getLogout().click();
		System.out.println("Logout------");
		
	}
	@AfterClass
	public void ConfigAC()
	{
		//Close the browser
		driver.quit();
		System.out.println("Browser closed");
	}
	
	@AfterTest
	public void ConfigAT()
	{
		System.out.println("Post-Condition Satisfies");
	}
	
	@AfterSuite
	public void ConfigAS()
	{
		System.out.println("close the DB Connectivity");
	}
}



