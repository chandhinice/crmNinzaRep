package Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[.='16'])[2]")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
