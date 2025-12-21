package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_ActionClass {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
		Thread.sleep(3000);
		Actions action= new Actions(driver);
		action.moveToElement(ref).perform();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
