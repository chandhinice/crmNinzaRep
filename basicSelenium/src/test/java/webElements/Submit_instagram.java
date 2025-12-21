package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit_instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.instagram.com/");
	      Thread.sleep(1000);
	      driver.findElement(By.name("username")).sendKeys("Chandhu345");
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//div[.='Log in']")).submit();
	      Thread.sleep(3000);
	     
	      driver.quit();
	}

}
