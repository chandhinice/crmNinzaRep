package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Verification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(ref.isDisplayed());
		System.out.println(ref.isEnabled());
		driver.findElement(By.name("username")).sendKeys("Test3455");
		driver.findElement(By.name("password")).sendKeys("234567"
				+ ""
				+ ""
				+ ""
				+ "");
		Thread.sleep(1000);
		//ref.click();
		System.out.println(ref.isEnabled());
		driver.quit();
		
	}

}
