package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More' and @name='q']")).sendKeys("iphone");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(500);
		String result = driver.findElement(By.xpath("//span[contains(.,'Showing 1 – 24')]")).getText();
		System.out.println(result);

	}

}

