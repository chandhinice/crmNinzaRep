package Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Puma");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-id='SHOH33SEUHBYT7H9']")).click();
		driver.close();
	}

}

