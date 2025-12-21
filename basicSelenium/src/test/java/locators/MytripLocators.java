package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MytripLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(1000);
	String offer = driver.findElement(By.xpath("//div[contains(.,'Register')]")).getText();
	System.out.println(offer);
	Thread.sleep(1000);
	String text = driver.findElement(By.xpath("//div[starts-with(.,'Register and Get Discount')]")).getText();
	System.out.println(text);
	Thread.sleep(1000);
	driver.quit();			

		
	}

}
