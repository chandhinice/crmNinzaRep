package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demowebshop.tricentis.com/");
	      Thread.sleep(1000);
	     WebElement ref = driver.findElement(By.id("small-searchterms"));
	     ref.sendKeys("Laptop");
	      Thread.sleep(1000);
	      //driver.findElement(By.xpath("//input[@type='submit']")).click();  
	      ref.clear();
	      Thread.sleep(1000);
	      ref.sendKeys("Laptop");
	      Thread.sleep(3000);
	      driver.quit();
	}

}
