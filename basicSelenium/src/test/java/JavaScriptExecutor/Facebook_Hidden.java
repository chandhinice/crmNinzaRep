package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Hidden {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.id("custom_gender"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='NDA'",ref);
		Thread.sleep(3000);
		WebElement Day = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].click()",Day);
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='15'",Day );
		Thread.sleep(2000);
		WebElement Month = driver.findElement(By.id("month"));
		js.executeScript("arguments[0].value='7'",Month);
		Thread.sleep(2000);
		WebElement Year = driver.findElement(By.id("year"));
		js.executeScript("arguments[0].value='1999'",Year);
		Thread.sleep(2000);
		driver.quit();
	}
	

}
