


package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators_DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.youtube.com/");
//		Thread.sleep(1000);
//		WebElement ref = driver.findElement(By.id("endpoint"));
//		Thread.sleep(1000);
//		driver.findElement(RelativeLocator.with(By.tagName("a")).above(ref)).click();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.xpath("//input[@type='submit']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(ref)).sendKeys("Phone");
		Thread.sleep(1000);
		driver.quit();
		

	}

}
