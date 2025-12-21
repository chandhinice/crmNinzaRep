package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ref);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", ref);
	}

}
