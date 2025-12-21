package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Vtiger {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("username")).sendKeys("TestAdmin");
		Thread.sleep(500);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(500);
		driver.findElement(By.name("password")).sendKeys("test1234");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(500);
		driver.quit();
		
		
		
		
		}

}
