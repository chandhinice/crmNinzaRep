package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue_Zepto {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		Thread.sleep(1000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		  WebElement style = driver.findElement(By.xpath("//button[.='Add to cart']"));
		  System.out.println(style.getCssValue("background-color"));
		  System.out.println(style.getCssValue("font-size"));
		  driver.quit();
	}

}
