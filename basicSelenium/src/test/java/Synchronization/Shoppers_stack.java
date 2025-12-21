package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppers_stack {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//span[.='APPLE iPhone 13 Pro max']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("560004");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
