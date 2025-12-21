package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Instagram_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.xpath("//span[.='Log in with Facebook']"));
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(ref).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement ref1 = driver.findElement(By.xpath("//span[.='Log in with Facebook']"));
		Thread.sleep(3000);
		action.click(ref1).perform();	
		Thread.sleep(3000);
		driver.quit();

	}
	

}
