package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demowebshop.tricentis.com/");
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//a[.='14.1-inch Laptop']")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.id("add-to-cart-button-31")).click();	
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//a[.='Build your own expensive computer']/..//div")).click();
	       
	       
	       }

	
	
}
