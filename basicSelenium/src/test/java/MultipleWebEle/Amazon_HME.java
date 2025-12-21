package MultipleWebEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_HME {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
//		List<WebElement> ref = driver.findElements(By.xpath("//div[@id='nav-main']"));
//		for (WebElement MulEle : ref) {
//			
//			System.out.println(MulEle.getText());
//		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(1000);
		List<WebElement> ref = driver.findElements(By.xpath("//button[.='Add to cart']"));
		for (WebElement products : ref) {
			Thread.sleep(500);
			products.click();
		}
		Thread.sleep(1000);
		driver.findElement(By.id("nav-cart-count")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
