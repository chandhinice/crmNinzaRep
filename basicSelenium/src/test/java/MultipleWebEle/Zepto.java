package MultipleWebEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zepto {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zeptonow.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@aria-label='Search for products']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("cupcakes");
		Thread.sleep(1000);
	
		
			
		}
		}
	


