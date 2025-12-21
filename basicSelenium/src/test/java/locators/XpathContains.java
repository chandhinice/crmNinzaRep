package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();
		Thread.sleep(1000);
	   String errormsg = driver.findElement(By.xpath("//span[contains(.,'unsuccessful')]")).getText();
	   System.out.println(errormsg);
	   Thread.sleep(2000);
	   driver.quit();
	   
		

	}

}
