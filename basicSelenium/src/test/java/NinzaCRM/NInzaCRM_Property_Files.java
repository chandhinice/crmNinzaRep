package NinzaCRM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NInzaCRM_Property_Files {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=null;
		FileInputStream fis=new FileInputStream("./src/test/resources/common.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String Url = pobj.getProperty("url");
	   String Username=pobj.getProperty("username");
	   String Password=pobj.getProperty("password");
	   
		String BROWSER=pobj.getProperty("browser");
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
			
			
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(Url);
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("inputPassword")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		fis.close();
		FileInputStream efis =new FileInputStream("C:\\Users\\hp\\Documents\\CreateCampaign.xlsx");
		Workbook wb= WorkbookFactory.create(efis);
		Sheet sh=wb.getSheet("Create_Campaign");
		String CampName=sh.getRow(1).getCell(2).getStringCellValue();
		String TargetSize=sh.getRow(2).getCell(2).getStringCellValue();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Create Campaign']")).click();
		driver.findElement(By.name("campaignName")).sendKeys(CampName);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(TargetSize);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
	
		
		
	}
	

}
