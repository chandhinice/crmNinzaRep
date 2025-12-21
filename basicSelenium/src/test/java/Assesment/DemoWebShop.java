package Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='14.1-inch Laptop']/ancestor::div[@data-productid='31']//input[@type='button']")).click();
		Thread.sleep(5000);
		 WebElement ref = driver.findElement(By.xpath("//a[.='Build your own cheap computer']/ancestor::div[@data-productid='72']/parent::div[@class='item-box']//input[@type='button']"));
		Thread.sleep(1000);
		ref.click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button-72")).click();
		 Thread.sleep(5000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[.='Build your own computer']/ancestor::div[@data-productid='16']//input[@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='product_attribute_16_3_6_19']/..//input[@type='radio']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button-16")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
	}
	

}
