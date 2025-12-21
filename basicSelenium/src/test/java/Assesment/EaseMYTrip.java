package Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EaseMYTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("frth_1_20/10/2025")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
