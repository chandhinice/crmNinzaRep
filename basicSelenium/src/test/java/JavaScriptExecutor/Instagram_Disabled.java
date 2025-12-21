package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Disabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ref);
		Thread.sleep(2000);
		driver.quit();
	}

}
