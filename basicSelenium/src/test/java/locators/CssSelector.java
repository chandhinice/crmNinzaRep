package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("laptop");
		driver.findElement(By.cssSelector("div.newsletter-email")).sendKeys("test345@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

}
