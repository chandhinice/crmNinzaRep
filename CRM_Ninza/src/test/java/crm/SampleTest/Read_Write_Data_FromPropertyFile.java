package crm.SampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import crm.generic.fileutility.File_Utility;
import crm.pomclass.Login_Page_WebElements;

public class Read_Write_Data_FromPropertyFile {


	public static void main(String[] args) throws Exception {
		WebDriver driver=null;
		File_Utility Flib=new File_Utility();
		String BROWSER=Flib.readDataFromPropertyFile("browser");
		System.out.println(BROWSER);
		
		String USERNAME=Flib.readDataFromPropertyFile("username");
		System.out.println(USERNAME);
		String PASSWORD=Flib.readDataFromPropertyFile("password");
		System.out.println(PASSWORD);
		String URL=Flib.readDataFromPropertyFile("url");
		System.out.println(URL);
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
		driver.get(URL);
		//Flib.writeDataToPropertyFile("element", "Login");
		//login.loginToapp(USERNAME, PASSWORD);
		Login_Page_WebElements login= new Login_Page_WebElements(driver);
		login.getUsername().sendKeys(USERNAME);
		login.getPassword().sendKeys(PASSWORD);
		login.getSignIn().click();
		System.out.println("LOGIN SUCCESSFULL");
		driver.quit();
		
	}

}
