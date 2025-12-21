package Assesment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement color = driver.findElement(By.xpath("//span[.='Apple iPhone 15 (128 GB) - Pink']/../../../..//a[@aria-current='true' or @aria-current='false']"));
//         for (WebElement color : ref) {
//        	 Thread.sleep(500);
			System.out.println(color.getAccessibleName());
//		}

}
	
	
}