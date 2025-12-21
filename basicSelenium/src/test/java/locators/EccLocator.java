package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EccLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("Testyanthra@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("12345");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("chandhini11");
		driver.findElement(By.cssSelector("input[name=\'password\']")).sendKeys("345678");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		Thread.sleep(1000);
		driver.quit();		
		
		
		
	}

}
