package Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Youtube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Wikipedia");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
