package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nmae {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Test23");
		driver.findElement(By.name("password")).sendKeys("1234");

	}

}
