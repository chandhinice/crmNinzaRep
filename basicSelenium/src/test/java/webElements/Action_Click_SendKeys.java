package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_Click_SendKeys {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
      Thread.sleep(1000);
      driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
      driver.findElement(By.xpath("//input[@type='submit']")).click();  
      driver.quit();
	}

}
